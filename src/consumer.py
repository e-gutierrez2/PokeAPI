import requests  # Importamos la librería requests
import time  # Importamos time para manejar las pausas

for i in range(1, 1304):  # El ID de los Pokémon comienza desde 1
    # URL del Pokémon
    url = f"https://pokeapi.co/api/v2/pokemon/{i}"

    # Hacemos la solicitud a la API
    response = requests.get(url)

    # Verificamos si la respuesta fue exitosa (código 200)
    if response.status_code == 200:
        data = response.json()  # Convertimos la respuesta en un diccionario Python

        # Extraemos la información del Pokémon
        nombre = data["name"]  # Nombre del Pokémon
        id_pokemon = data["id"]  # ID del Pokémon
        altura = data["height"]  # Altura en decímetros
        peso = data["weight"]  # Peso en hectogramos

        # Extraemos los tipos del Pokémon
        tipos = [tipo["type"]["name"] for tipo in data["types"]]

        # Variables para la generación y región (inicialmente vacías)
        generacion = "Desconocida"
        region = "Desconocida"

        # Iteramos sobre las generaciones (1 a 9)
        for j in range(1, 10):
            generations_url = f"https://pokeapi.co/api/v2/generation/{j}"
            response2 = requests.get(generations_url)

            if response2.status_code == 200:
                data2 = response2.json()

                # Buscamos el Pokémon en la lista de especies
                for species in data2["pokemon_species"]:
                    if species["name"] == nombre:  # Comparamos los nombres
                        region = data2["main_region"]["name"]
                        generacion = j  # Asignamos la generación
                        break  # Salimos del bucle si encontramos coincidencia

            time.sleep(0.05)  # Pequeña pausa para evitar sobrecargar la API

        # Mostramos la información en pantalla
        print(f"Name: {nombre}")
        print(f"ID: {id_pokemon}")
        print(f"Height: {altura} dm")
        print(f"Weight: {peso} hg")
        print(f"Types: {', '.join(tipos)}")
        print(f"Generation: {generacion}")
        print(f"Region: {region}")
        print("-----------------")

        time.sleep(0.05)  # Pausa entre cada petición para evitar bloqueos

    else:
        print(f"Error {response.status_code}: No se pudo obtener la información del Pokémon.")
