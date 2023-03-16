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
    private String processorVersion;
    private Integer valueOfCheap;
    private Scanner informationScanner;
    private List<String> stringArrayList = new LinkedList<>();

    public LocalProcessor(String processorName, Long period, String processorVersion, Integer valueOfCheap,
                          Scanner informationScanner, List<String> stringArrayList) {
        this.processorName = processorName;
        this.period = period;
        this.processorVersion = processorVersion;
        this.valueOfCheap = valueOfCheap;
        this.informationScanner = informationScanner;
        this.stringArrayList = stringArrayList;
    }

    public LocalProcessor() {
    }

    public String getProcessorName() {
        return processorName;
    }

    public Long getPeriod() {
        return period;
    }

    public String getProcessorVersion() {
        return processorVersion;
    }

    public Integer getValueOfCheap() {
        return valueOfCheap;
    }

    public Scanner getInformationScanner() {
        return informationScanner;
    }

    public List<String> getStringArrayList() {
        return stringArrayList;
    }

    @ListIteratorAnnotation
    public void listIterator(List<String> stringList) {
        stringArrayList = new LinkedList<>(stringList);
        for (String str : stringArrayList) {
            System.out.println(str.hashCode());
        }
    }

    @FullNameProcessorGeneratorAnnotation
    public String fullNameProcessorGenerator(List<String> stringList) {
        StringBuilder stb = new StringBuilder(processorName);
        for (String sss : stringList) {
            stb.append(sss).append(" ");
        }
        return stb.toString();
    }

    @ReadFullProcessorNameAnnotation
    public void readFullProcessorName(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        try (Scanner sc = new Scanner(file)) {

            StringBuilder strBuilder = new StringBuilder(processorVersion);
            while (sc.hasNextLine()) {
                strBuilder.append(sc.hasNextLine());
            }
            processorVersion = strBuilder.toString();
        }
    }


}
