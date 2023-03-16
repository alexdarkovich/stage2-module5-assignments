package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import assignments.annotations.FullNameProcessorGeneratorAnnotation;
import assignments.annotations.ListIteratorAnnotation;
import assignments.annotations.ReadFullProcessorNameAnnotation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalProcessor {
    private String processorName;
    private Long period = 10_000_000_000_000L;
    private String ProcessorVersion;
    private Integer valueofCheap;
    private Scanner informationscanner;
    private List<String> stringArrayList = new LinkedList<>();

    public LocalProcessor(String processorName, Long period, String processorVersion, Integer valueOfCheap,
                          Scanner informationscanner, List<String> stringArrayList) {
        this.processorName = processorName;
        this.period = period;
        ProcessorVersion = processorVersion;
        this.valueofCheap = valueOfCheap;
        this.informationscanner = informationscanner;
        this.stringArrayList = stringArrayList;
    }

    public LocalProcessor() {
    }

//    @ListIteratorAnnotation
//    public void listiterator(List<String> stringList) {
//        stringArrayList = new LinkedList<>(stringList);
//        for (String str : stringArrayList) {
//            System.out.println(str.hashCode());
//        }
//    }
//    @FullNameProcessorGeneratorAnnotation
//    public String fullnameProcessorgenerator(List<String> stringList) {
//        StringBuilder stb = new StringBuilder(processorName);
//        for (String sss : stringList) {
//            stb.append(sss).append(" ");
//        }
//        return stb.toString();
//    }
//    @ReadFullProcessorNameAnnotation
//    public void readfullprocessorname(File file) throws FileNotFoundException {
//        try (Scanner sc = new Scanner(file)) {
//
//            StringBuilder strBuilder = new StringBuilder(ProcessorVersion);
//            while (sc.hasNextLine()) {
//                strBuilder.append(sc.hasNextLine());
//            }
//            ProcessorVersion = strBuilder.toString();
//        }
//    }


    @ListIteratorAnnotation
    public void listiterator(LinkedList<String> stringList) {
        stringArrayList = new LinkedList<>(stringList);
        for (int i = 0; i < period; i++) {
            System.out.println(stringArrayList.get(i).hashCode());
        }
    }

    @FullNameProcessorGeneratorAnnotation
    public String fullnameProcessorgenerator(LinkedList<String> stringList) {
        for (int i = 0; i < stringArrayList.size(); i++) {
            processorName += stringList.get(i) + ' ';
        }
        return processorName;
    }

    @ReadFullProcessorNameAnnotation
    public void readfullprocessorname(File file) throws FileNotFoundException {
        informationscanner = new Scanner(file);
        while (informationscanner.hasNext()) {
            ProcessorVersion += informationscanner.nextLine();
        }
    }
}
