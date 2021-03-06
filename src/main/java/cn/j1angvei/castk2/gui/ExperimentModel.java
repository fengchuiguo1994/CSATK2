package cn.j1angvei.castk2.gui;

import javafx.beans.property.*;

/**
 * Created by Wayne on 5/3 0003.
 */
public class ExperimentModel {
    private final StringProperty code;
    private final StringProperty fastq1;
    private final StringProperty fastq2;
    private final StringProperty control;
    private final IntegerProperty genomeCode;
    private final BooleanProperty broadPeak;

    public ExperimentModel() {
        this(null, null, null, null, 0, false);
    }

    public ExperimentModel(ExperimentModel oldModel) {
        this(oldModel.getCode(), oldModel.getFastq1(), oldModel.getFastq2(), oldModel.getControl(), oldModel.getGenomeCode(), oldModel.isBroadPeak());
    }

    public ExperimentModel(String code, String fastq1, String fastq2, String control, int genomeCode, boolean broadPeak) {
        this.code = new SimpleStringProperty(code);
        this.fastq1 = new SimpleStringProperty(fastq1);
        this.fastq2 = new SimpleStringProperty(fastq2);
        this.control = new SimpleStringProperty(control);
        this.genomeCode = new SimpleIntegerProperty(genomeCode);
        this.broadPeak = new SimpleBooleanProperty(broadPeak);
    }

    public String getCode() {
        return code.get();
    }

    public void setCode(String code) {
        this.code.set(code);
    }

    public StringProperty codeProperty() {
        return code;
    }

    public String getFastq1() {
        return fastq1.get();
    }

    public void setFastq1(String fastq1) {
        this.fastq1.set(fastq1);
    }

    public StringProperty fastq1Property() {
        return fastq1;
    }

    public String getFastq2() {
        return fastq2.get();
    }

    public void setFastq2(String fastq2) {
        this.fastq2.set(fastq2);
    }

    public StringProperty fastq2Property() {
        return fastq2;
    }

    public String getControl() {
        return control.get();
    }

    public void setControl(String control) {
        this.control.set(control);
    }

    public StringProperty controlProperty() {
        return control;
    }

    public int getGenomeCode() {
        return genomeCode.get();
    }

    public void setGenomeCode(int genomeCode) {
        this.genomeCode.set(genomeCode);
    }

    public IntegerProperty genomeCodeProperty() {
        return genomeCode;
    }

    public boolean isBroadPeak() {
        return broadPeak.get();
    }

    public void setBroadPeak(boolean broadPeak) {
        this.broadPeak.set(broadPeak);
    }

    public BooleanProperty broadPeakProperty() {
        return broadPeak;
    }
}
