package edu.emory.bmi.niffler.csv.scanner_util;


import com.opencsv.bean.CsvBindByPosition;
import edu.emory.bmi.niffler.csv.core.AbstractCsvBean;

public class FilterCsvBean extends AbstractCsvBean {

    @CsvBindByPosition(position = 0)
    private String scanner;

    @CsvBindByPosition(position = 1)
    private String institute;

    public void produceFinal() {
    }

    @Override
    public void produceFinal(String fileName) {
    }

    @Override
    public String getScanner() {
        return scanner;
    }

    @Override
    public String getDetails() {
        return institute;
    }

}
