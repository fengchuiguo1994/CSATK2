package cn.j1angvei.castk2.input;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mjian on 2016/11/29.
 */
public class Input {
    private List<Genome> genomes;
    private List<Experiment> experiments;

    public Input() {
        genomes = new ArrayList<>();
        experiments = new ArrayList<>();
    }

    public List<Genome> getGenomes() {
        return genomes;
    }

    public List<Experiment> getExperiments() {
        return experiments;
    }

    public void setGenomes(List<Genome> genomes) {
        this.genomes = genomes;
    }

    public void setExperiments(List<Experiment> experiments) {
        this.experiments = experiments;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
