package cn.j1angvei.castk2;

/**
 * Created by j1angvei on 2016/12/7.
 */
public enum Function {
    GENOME_IDX("gi", "build genome index using bwa"),
    GENOME_SIZE("gs", "generate genome size file using SAMTools faidx"),
    GENOME_TSS("gt", "calculate TSS position using Homer parseGTF.pl"),
    QC_RAW("qr", "do quality control of raw reads using FastQC"),
    PARSE_RAW("ar", "parse key information from raw reads' qc result"),
    TRIM("tm", "filter adapter and bad quality reads using Trimmomatic"),
    QC_CLEAN("qc", "do quality control of filtered reads using FastQC"),
    PARSE_CLEAN("ac", "parse key information from filtered reads' qc result"),
    ALIGNMENT("al", "align reads using bwa(BWA-MEM for > 70 bp, BWA-ALN for < 70bp)"),
    CONVERT_SAM("cs", "convert sam file to bam file using SAMTools"),
    SORT_BAM("sb", "sort converted bam files using SAMTools"),
    CHIP_QUALITY("cq", "calculate ChIP quality using deeptools fingerprint"),
    QC_BAM("qb", "do quality control of sorted bam file using QualiMap"),
    RMDUP_BAM("rb", "remove PCR amplified reads from bam file using SAMTools"),
    UNIQUE_BAM("ub", "filter reads those mapping quality >30 using SAMTools"),
    FLAGSTAT("fs", "count reads in all bam files using SAMTools flagstat"),
    PEAK_CALLING("pc", "do peak calling using MACS2"),
    BIGWIG("bw", "convert bedgraph generated by MACS2 to bigwig and wig format using UCSC executable"),
    MOTIF("mt", "find motifs using Homer"),
    PEAK_ANNOTATION("pa", "do peak annotation using Homer"),
    DEEPTOOLS("dt", "plot enrichment and correlation information using deeptools"),
    CORRELATION("cl", "calculate different experiments's correlation using deeptools's spearman algorithm"),
    GENE_LIST("gl", "get annotated gene from annotation bed file"),
    GO_PATHWAY("gp", "do GO & Pathway analysis using PANTHERDB.org(Network connection needed!)"),
    STATISTIC("st", "do a statistics from output"),
    HTML("ht", "plot the statistic in HTML format");

    private String keyword;
    private String hint;

    Function(String keyword, String hint) {
        this.keyword = keyword;
        this.hint = hint;
    }

    public static Function fromKeyword(String keyword) {
        for (Function function : Function.values()) {
            if (keyword.equalsIgnoreCase(function.getKeyword())) {
                return function;
            }
        }
        throw new IllegalArgumentException("Function using keyword " + keyword + " not found");
    }

    public static String getFunctionUsage() {
        StringBuilder sb = new StringBuilder();
        for (Function function : Function.values()) {
            sb.append(function.toString())
                    .append("\n");
        }
        return sb.toString();
    }

    public static String assemblePipelineKeywords() {
        StringBuilder builder = new StringBuilder();
        for (Function function : Function.values()) {
            builder.append(function.getKeyword())
                    .append(",");
        }
        String keywords = builder.toString();
        System.out.println("pipeline " + keywords);
        return keywords.substring(0, keywords.length() - 1);
    }

    public String getKeyword() {
        return keyword;
    }

    public String getHint() {
        return hint;
    }

    @Override
    public String toString() {
        return "\t" + this.keyword + ",\t" + this.hint;
    }
}
