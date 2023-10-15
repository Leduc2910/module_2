package IOfile.Manager;

import IOfile.Model.Product;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteProductList {
    File file = new File("products.csv");

    public void writeList(ArrayList<Product> list) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Product product : list
            ) {
                line += product.getId() + "," + product.getName() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getCategorize() + "\n";
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Product> readFile() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Product product = new Product(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4]);
                list.add(product);
            }
            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
