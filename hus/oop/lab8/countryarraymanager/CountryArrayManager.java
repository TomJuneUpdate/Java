package hus.oop.lab8.countryarraymanager;


import java.util.Arrays;
//import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
//    private List<Country> countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    // tìm phần tử null biến phần phía sau thành null
    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    // Tăng chiều dài mảng lên x2
    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    // Thêm phần tử vào mảng
    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    // thêm vào vị trí i
    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    // xóa phần tử vị trí index
    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    // trả về phần tử vị trí index
    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < this.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < this.length; j++)
                if (newArray[j].getPopulation() < newArray[min_idx].getPopulation()) min_idx = j;
            // Swap the found minimum element with the first
            // element
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        /* TODO */
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        // One by one move boundary of unsorted subarray
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < this.length - 1; i++) {
            // Find the minimum element in unsorted array
            int max_idx = i;
            for (int j = i + 1; j < this.length; j++)
                if (newArray[j].getPopulation() > newArray[max_idx].getPopulation()) max_idx = j;
            // Swap the found minimum element with the first
            // element
            Country temp = newArray[max_idx];
            newArray[max_idx] = newArray[i];
            newArray[i] = temp;
        }
        /* TODO */
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < this.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[j].getArea() < newArray[minIndex].getArea()) {
                    minIndex = j;
                }
            }
            Country temp = newArray[minIndex];
            newArray[minIndex] = newArray[i];
            newArray[i] = temp;
        }

        /* TODO */
//        Arrays.sort(newArray, new Comparator<Country>() {
//            @Override
//            public int compare(Country left, Country right) {
//                if (right.getGdp() > left.getGdp()) {
//                    return 1;
//                } else if (right.getGdp() < left.getGdp()) {
//                    return -1;
//                } else return 0;
//            }
//        });
        return newArray;

    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[j].getArea() > newArray[maxIndex].getArea()) {
                    maxIndex = j;
                }
            }
            Country temp = newArray[maxIndex];
            newArray[maxIndex] = newArray[i];
            newArray[i] = temp;
        }

        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < this.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < this.length; j++)
                if (newArray[j].getGdp() < newArray[min_idx].getGdp()) min_idx = j;
            // Swap the found minimum element with the first
            // element
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }

        /* TODO */
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < this.length - 1; i++) {
            // Find the minimum element in unsorted array
            int max_idx = i;
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[j].getGdp() > newArray[max_idx].getGdp()) {
                    max_idx = j;
                    // Swap the found minimum element with the first
                    // element
                    Country temp = newArray[max_idx];
                    newArray[max_idx] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }
        /* TODO */
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {

        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) countries[i];
                index++;
            }
        }
        return Arrays.copyOf(africaCountries, index);
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */

        AsiaCountry[] asiaCountries = new AsiaCountry[countries.length];
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                asiaCountries[index] = (AsiaCountry) countries[i];
                index++;
            }
        }
        return Arrays.copyOf(asiaCountries, index);
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) countries[i];
                index++;
            }
        }
        return Arrays.copyOf(europeCountries, index);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) countries[i];
                index++;
            }
        }
        return Arrays.copyOf(northAmericaCountries, index);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */

        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[this.length];
        int index = 0;
        for (Country element : countries) {
            if (element instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) element;
                index++;
            }
        }
        return Arrays.copyOf(oceaniaCountries, index);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[this.length];
        int index = 0;
        for (Country element : countries) {
            if (element instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) element;
                index++;
            }
        }
        return Arrays.copyOf(southAmericaCountries, index);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] sortPopulation = sortByIncreasingPopulation();
        Country[] newArr = new Country[howMany];
        System.arraycopy(sortPopulation, 0, newArr, 0, howMany);
        return newArr;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] increasingByPopulationArr = sortByDecreasingPopulation();
        Country[] newArr = new Country[howMany];
        System.arraycopy(increasingByPopulationArr, 0, newArr, 0, howMany);
        return newArr;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] sortAreaArr = sortByDecreasingArea();
        Country[] newArr = new Country[howMany];
        System.arraycopy(sortAreaArr, 0, newArr, 0, howMany);
        return newArr;
        /* TODO */
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] sortAreaArr = sortByIncreasingArea();
        Country[] newArr = new Country[howMany];
        System.arraycopy(sortAreaArr, 0, newArr, 0, howMany);
        return newArr;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] sortGdpArr = sortByDecreasingGdp();
        Country[] newArr = new Country[howMany];
        System.arraycopy(sortGdpArr, 0, newArr, 0, howMany);
        return newArr;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] sortGdpArr = sortByIncreasingGdp();
        Country[] newArr = new Country[howMany];
        System.arraycopy(sortGdpArr, 0, newArr, 0, howMany);
        return newArr;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.println(countriesString.toString().trim() + "]");
    }

}
