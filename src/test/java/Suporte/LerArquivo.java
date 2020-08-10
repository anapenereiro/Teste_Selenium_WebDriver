package Suporte;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

    public class LerArquivo {

        // método que recebe o nome do arquivo json
        public static String LerArquivoJson(String campo) {

            // criando um parses para a leitura do arquivo json
            JSONParser parser = new JSONParser();
            // inserindo o arquivo json em um objeto
            JSONObject jsonDataObject = null;
              try {
                Object jsonFileObject = parser.parse(new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                        File.separator + "test" + File.separator + "java" + File.separator + "Suporte" + File.separator + "PesquisarData.json"));
                jsonDataObject = (JSONObject) jsonFileObject;
            } catch (Exception e) {
                e.printStackTrace();
            }
            assert jsonDataObject != null;
            return (String) jsonDataObject.get(campo);
        }
    }
