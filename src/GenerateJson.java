package PACKAGE_NAME;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateJson {
  public void SaveJson (address address) throws IOException {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
          FileWriter writing = new FileWriter(address.cep() + ".json");
          writing.write(gson.toJson(address));
          writing.close();
  }
}
