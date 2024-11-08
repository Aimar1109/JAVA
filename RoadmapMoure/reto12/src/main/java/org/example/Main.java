package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {


        String filePath = Paths.get("src", "main", "resources", "data.json").toString();

        File file_exits = new File(filePath);

        if (!file_exits.exists()) {
            try (FileWriter file = new FileWriter(filePath)) {
                JSONObject personas = new JSONObject();

                JSONObject aimar = new JSONObject();
                List<String> languages = new ArrayList<>();
                languages.add("python");
                languages.add("java");

                aimar.put("nombre", "aimar");
                aimar.put("edad", 22);
                aimar.put("nacimiento", "06/10/2006");
                aimar.put("lenguajes", languages);

                JSONObject juan = new JSONObject();
                List<String> languages1 = new ArrayList<>();
                languages.add("c");
                languages.add("kotlin");

                juan.put("nombre", "juan");
                juan.put("edad", 23);
                juan.put("nacimiento", "05/12/2000");
                juan.put("lenguajes", languages);

                personas.put("01", aimar);
                personas.put("02", juan);

                file.write(personas.toString());

            } catch (IOException e) {
                e.getStackTrace();
            }
        } else {
            try (BufferedReader lector = new BufferedReader((new FileReader(filePath)))) {
                StringBuilder jsonContent = new StringBuilder();
                String line;

                while((line = lector.readLine()) != null) {
                    jsonContent.append(line);
                }

                JSONObject jo = new JSONObject(jsonContent.toString());
                ArrayList<Persona> personas = new ArrayList<>();

                Iterator<String> keys = jo.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject value = (JSONObject) jo.get(key);
                    Persona persona = new Persona();
                    persona.setNombre((String) value.get("nombre"));
                    persona.setEdad((Integer) value.get("edad"));
                    persona.setNacimiento((String) value.get("nacimiento"));
                    persona.setLenguajes((JSONArray) value.get("lenguajes"));
                    personas.add(persona);
                }
                
            } catch (IOException e) {
                e.getStackTrace();
            }
        }


    }
}
