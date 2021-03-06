package cn.j1angvei.castk2;

/**
 * Created by Wayne on 2/28 0028.
 */
public class Constant {
    /**
     * all suffix for intermediate result file
     */
    public static final String SFX_NARROW_PEAKS = "_peaks.narrowPeak";
    public static final String SFX_BROAD_PEAKS = "_peaks.broadPeak";
    public static final String SFX_ANNO_BED = "_annotation.bed";
    public static final String SFX_CONVERTED_BAM = ".sam.bam";
    public static final String SFX_SORTED_BAM = ".sorted.bam";
    public static final String SFX_RMDUP_BAM = ".rmdup.bam";
    public static final String SFX_UNIQUE_BAM = ".unique.bam";
    public static final String SFX_GENE_LIST = "_geneList.txt";
    public static final String SFX_GO_PATHWAY = "_go_pathway.txt";
    public static final String SFX_BEDGRAPH = "_treat_pileup.bdg";
    /**
     * real executable in homer
     */
    public static final String EXE_HOMER_ANNOTATE_PEAK = "annotatePeaks.pl";
    public static final String EXE_HOMER_FIND_MOTIF = "findMotifsGenome.pl";
    public static final String EXE_HOMER_PARSE_GTF = "parseGTF.pl";
    /**
     * real executable in deeptools
     */
    //calculate chip quality
    public static final String EXE_DT_PLOT_FINGERPRINT = "plotFingerprint";

    //convert bam file to bigwig
    public static final String EXE_DT_BAMCOMPARE = "bamCompare";
    public static final String EXE_DT_BAMCOVERAGE = "bamCoverage";
    //calculate matrix, which will be used fro plotHeatmap and plotProfile
    public static final String EXE_DT_COMPUTEMATRIX = "computeMatrix";

    //plot tss heatmap and profile
    public static final String EXE_DT_PLOTHEATMAP = "plotHeatmap";
    public static final String EXE_DT_PLOTPROFILE = "plotProfile";

    //correlation
    public static final String EXE_DT_MULTI_BAM_SUMMARY = "multiBamSummary";
    public static final String EXE_DT_PLOT_CORRELATION = "plotCorrelation";
    /**
     * deeptools intermediate files suffix
     */
    public static final String SFX_DT_BIG_WIG = ".deeptools.bw";
    public static final String SFX_DT_TSS_MATRIX = ".tss.matrix.gz";
    public static final String SFX_DT_PEAK_MATRIX = ".peak.matrix.gz";
    public static final String SFX_DT_NPZ = "dt.multibigwigsummary.npz";

    //png suffix
    public static final String PNG_DT_CORRELATION = "dt.correlation.png";
    public static final String PNG_DT_PROFILE = ".tss.profile.png";
    public static final String PNG_DT_HEATMAP = ".peak.heatmap.png";
    public static final String PNG_DT_PEAK_OVER_CHROMOSOME = ".peak.over.chromosome.png";
    public static final String PNG_DT_FINGER_PRINT = "dt.fingerprint.png";
    /**
     * genome relevant suffix
     */
    public static final String SFX_GENOME_FAIDX = ".fai";
    public static final String SFX_GENOME_SIZES = ".sizes";
//    public static final String SFX_GENOME_TSS = ".tss.bed";
    /**
     * real executable distributed by UCSC
     */
//    public static final String EXE_UCSC_BED_SORT = "bedSort";
//    public static final String EXE_UCSC_BEDGRAPH_2_BIGWIG = "bedGraphToBigWig";
//    public static final String EXE_UCSC_BIGWIG_2_WIG = "bigWigToWig";
    public static final String EXE_UCSC_GFF3_TO_GENEPRED = "gff3ToGenePred";
    public static final String EXE_UCSC_GTF_TO_GENEPRED = "gtfToGenePred";
    public static final String EXE_UCSC_GENEPRED_TO_BED = "genePredToBed";

    /**
     * bigWig file relevant suffix
     */
//    public static final String SFX_UCSC_BIG_WIG = ".ucsc.bw";
//    public static final String SFX_UCSC_WIG = ".wig";
    public static final String SFX_UCSC_GENEPRED = ".genePred";
    public static final String SFX_UCSC_GENE_BED = ".gene.bed";

    /**
     * FastQC generate zip report file name is, FastQ file name + "_fastqc.zip";
     */
    public static final String QC_ZIP_SFX = "_fastqc.zip";
    /**
     * some regular file name suffix
     */
    public static final String JSON_SFX = ".json";
    public static final String FA_SFX = ".fa";
    public static final String SAM_SFX = ".sam";
    public static final String SAI_SFX = ".sai";

    /**
     * specific suffix for intermediate file generated in analysis
     */
    public static final String FLAGSTAT_SFX = ".flagstat";

    /**
     * specific folder in output or software
     */
    public static final String FOLDER_KNOWN_MOTIF = "homerResults";

}
