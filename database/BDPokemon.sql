PRAGMA foreign_keys = OFF;

DROP TABLE IF EXISTS encounter;
DROP TABLE IF EXISTS pokemon_move;
DROP TABLE IF EXISTS pokemon_stat;
DROP TABLE IF EXISTS pokemon_type;
DROP TABLE IF EXISTS location;
DROP TABLE IF EXISTS pokemon;
DROP TABLE IF EXISTS move;
DROP TABLE IF EXISTS type;
DROP TABLE IF EXISTS region;
DROP TABLE IF EXISTS generation;

PRAGMA foreign_keys = ON;

CREATE TABLE generation (
    id_generation   INTEGER PRIMARY KEY NOT NULL,
    name            TEXT NOT NULL UNIQUE,
    id_region       INTEGER NOT NULL, 
    FOREIGN KEY (id_main_region) REFERENCES region(id_region)
);

CREATE TABLE region (
    id_region     INTEGER PRIMARY KEY NOT NULL,
    name          TEXT NOT NULL UNIQUE,
    id_generation INTEGER NOT NULL,
    FOREIGN KEY (id_generation) REFERENCES generation(id_generation)
);

CREATE TABLE type (
    id_type INTEGER PRIMARY KEY NOT NULL,
    name    TEXT NOT NULL UNIQUE
);

CREATE TABLE move (
    id_move       INTEGER PRIMARY KEY NOT NULL,
    name          TEXT NOT NULL UNIQUE,
    damage_class  TEXT,
    power         INTEGER,
    accuracy      INTEGER,
    pp            INTEGER,
    id_type       INTEGER,
    id_generation INTEGER NOT NULL,
    FOREIGN KEY (id_type)       REFERENCES type(id_type),
    FOREIGN KEY (id_generation) REFERENCES generation(id_generation)
);

CREATE TABLE pokemon (
    id_pokemon      INTEGER PRIMARY KEY NOT NULL,
    name            TEXT NOT NULL UNIQUE,
    base_experience INTEGER,
    height          INTEGER,
    weight          INTEGER,
    id_generation   INTEGER NOT NULL,
    sprite_url      TEXT,
    FOREIGN KEY (id_generation) REFERENCES generation(id_generation)
);

CREATE TABLE pokemon_type (
    id_pokemon INTEGER NOT NULL,
    id_type    INTEGER NOT NULL,
    slot       INTEGER NOT NULL,
    PRIMARY KEY (id_pokemon, id_type),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon),
    FOREIGN KEY (id_type)    REFERENCES type(id_type)
);

CREATE TABLE pokemon_stat (
    id_pokemon INTEGER NOT NULL,
    stat_name  TEXT NOT NULL,
    base_stat  INTEGER NOT NULL,
    effort     INTEGER NOT NULL DEFAULT 0,
    PRIMARY KEY (id_pokemon, stat_name),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon)
);

CREATE TABLE pokemon_move (
    id_pokemon    INTEGER NOT NULL,
    id_move       INTEGER NOT NULL,
    learn_method  TEXT NOT NULL,
    level_learned INTEGER DEFAULT 0,
    PRIMARY KEY (id_pokemon, id_move, learn_method),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon),
    FOREIGN KEY (id_move)    REFERENCES move(id_move)
);

CREATE TABLE location (
    id_location INTEGER PRIMARY KEY NOT NULL,
    name        TEXT NOT NULL UNIQUE,
    id_region   INTEGER NOT NULL,
    FOREIGN KEY (id_region) REFERENCES region(id_region)
);

CREATE TABLE encounter (
    id_encounter INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    id_pokemon   INTEGER NOT NULL,
    id_location  INTEGER NOT NULL,
    version      TEXT NOT NULL,
    method       TEXT NOT NULL,
    min_level    INTEGER NOT NULL,
    max_level    INTEGER NOT NULL,
    chance       INTEGER NOT NULL,
    FOREIGN KEY (id_pokemon)  REFERENCES pokemon(id_pokemon),
    FOREIGN KEY (id_location) REFERENCES location(id_location)
);

CREATE INDEX idx_pokemon_generation ON pokemon(id_generation);
CREATE INDEX idx_move_type          ON move(id_type);
CREATE INDEX idx_pokemon_type       ON pokemon_type(id_pokemon);
CREATE INDEX idx_pokemon_move       ON pokemon_move(id_pokemon);
CREATE INDEX idx_encounter_pokemon  ON encounter(id_pokemon);
CREATE INDEX idx_encounter_location ON encounter(id_location);
CREATE INDEX idx_location_region    ON location(id_region);