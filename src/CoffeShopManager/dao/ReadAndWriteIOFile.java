package CoffeShopManager.dao;

import CoffeShopManager.models.Coffe;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteIOFile {
    File file = new File("coffes.csv");

    public void writeFile(ArrayList<Coffe> list) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Coffe coffe :
                    list) {
                line += coffe.getName() + "," + coffe.getPrice() + "," + coffe.getCategorize() + "," + coffe.getDescription() + "," + coffe.getQuantity() + "\n";
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Coffe> readFile() {
        ArrayList<Coffe> list = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Coffe coffe = new Coffe(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                list.add(coffe);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
