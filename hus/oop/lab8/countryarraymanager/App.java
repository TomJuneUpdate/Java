package hus.oop.lab8.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();
    // Delimiter used in CSV file
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "continent,code,name";


    public static void main(String[] args) {
        init();
        onit(countryManager.filterSouthAmericaCountry());
        otxt(CountryArrayManager.codeOfCountriesToString(countryManager.getCountries()));
//        Country[] country = countryManager.filterAfricaCountry();
//        CountryArrayManager.print(country);
//        for (Country element : countryManager.sortByDecreasingPopulation()) {
//            System.out.println(element);
//        }
//        testOriginalData();
//        testSortIncreasingByPopulation();
//        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
//        testSortIncreasingByGdp();
//        testSortDecreasingByGdp();
//        testFilterMostPopulousCountries();
//        testFilterLeastPopulousCountries();
//        testFilterHighestGdpCountries();
//        testFilterLowestGdpCountries();
//        testFilterSmallestAreaCountries();
//        testFilterLargestAreaCountries();
        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                Country newCountry = null;
                if (dataList.get(5).equals("Asia")) {
                    newCountry = new AsiaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Europe")) {
                    newCountry = new EuropeCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Oceania")) {
                    newCountry = new OceaniaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("Africa")) {
                    newCountry = new AfricaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                } else if (dataList.get(5).equals("North America")) {
                    newCountry = new NorthAmericaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));

                } else if (dataList.get(5).equals("South America")) {
                    newCountry = new SouthAmericaCountry(
                            dataList.get(0),
                            dataList.get(1),
                            Integer.parseInt(dataList.get(2)),
                            Double.parseDouble(dataList.get(3)),
                            Double.parseDouble(dataList.get(4)));
                }
                countryManager.append(newCountry);
                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }


    public static void init() {
        String filePath = "D:/OOP1/lab8/src/hus/oop/lab8/data/countries.csv";
        readListData(filePath);
    }

    public static void onit(Country[] countries) {

        String fileName = "D:/OOP1/lab8/src/hus/oop/lab8/data/writeNameCountry.csv";
        writeCsvFile(fileName,countries);
    }

    public static void writeCsvFile(String fileName,Country[] countries) {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);
            // Write a new Country object list to the CSV file
//            Country newCountry = null;
//            int i = 0;
//            while (countryManager.getLength() > i) {
//                if (countryManager.getCountries()[i] instanceof AfricaCountry) {
//                    fileWriter.append("Africa Country");
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getCode());
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getName());
//                    fileWriter.append(NEW_LINE_SEPARATOR);
//                    i++ ;
//                }
//                if (countryManager.getCountries()[i] instanceof AsiaCountry) {
//                    fileWriter.append("Asia Country");
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getCode());
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getName());
//                    fileWriter.append(NEW_LINE_SEPARATOR);
//                    i++ ;
//                }
//                if (countryManager.getCountries()[i] instanceof EuropeCountry) {
//                    fileWriter.append("Europe Country");
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getCode());
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getName());
//                    fileWriter.append(NEW_LINE_SEPARATOR);
//                    i++ ;
//                }
//                if (countryManager.getCountries()[i] instanceof NorthAmericaCountry) {
//                    fileWriter.append("North America Country");
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getCode());
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getName());
//                    fileWriter.append(NEW_LINE_SEPARATOR);
//                    i++ ;
//                }
//                if (countryManager.getCountries()[i] instanceof OceaniaCountry) {
//                    fileWriter.append("Ocean Country");
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getCode());
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getName());
//                    fileWriter.append(NEW_LINE_SEPARATOR);
//                    i++ ;
//                }
//                if (countryManager.getCountries()[i] instanceof SouthAmericaCountry) {
//                    fileWriter.append("South America Country");
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getCode());
//                    fileWriter.append(COMMA_DELIMITER);
//                    fileWriter.append(countryManager.getCountries()[i].getName());
//                    fileWriter.append(NEW_LINE_SEPARATOR);
//                    i++ ;
//                }
//
//            }
                for (Country country : countries) {
                    fileWriter.append(country.getClass().getSimpleName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(country.getCode());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(country.getName());
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void otxt(String data) {

        String fileName = "D:/OOP1/lab8/src/hus/oop/lab8/data/test.txt";
        writeOut(fileName,data);
    }
    public static void writeOut(String file,String data) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);

    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        /* TODO */
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        /* TODO */
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        /* TODO */
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        /* TODO */
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        /* TODO */
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
        /* TODO */
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
        /* TODO */
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }
}
