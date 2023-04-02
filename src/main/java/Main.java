import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dmytro", "Hannych");

        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
