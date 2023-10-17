package mv.learning.protobuf;

import com.learning.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
//        Person mat = Person.newBuilder()
//                .setName("Mateus Valentim")
//                .setAge(25)
//                .build();
        Path path = Paths.get("mat.ser");
//        Files.write(path, mat.toByteArray());
        byte[] bytes = Files.readAllBytes(path);
        Person newMat = Person.parseFrom(bytes);
        System.out.println(newMat);
    }
}
