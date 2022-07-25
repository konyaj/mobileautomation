package nz.co.riharium.mobile.automation.calculator.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Janaki");
        list.add("Anitha");
        list.add("Riha");
        list.add("Bhrarthi");
        list.add("Babu");

        List<String> blist = list.stream().filter(s -> s.startsWith("B")).sorted().collect(Collectors.toList());
    }

}
