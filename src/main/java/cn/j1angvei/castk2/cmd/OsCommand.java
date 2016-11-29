package cn.j1angvei.castk2.cmd;

import java.io.File;

/**
 * Created by mjian on 2016/11/29.
 */
public class OsCommand {
    public static String unpack(String archive, String destDir) {
        if (archive.endsWith(".zip")) {
            return unzip(archive, destDir);
        } else if (archive.endsWith(".tar.gz")) {
            return tarGz(archive, destDir);
        } else if (archive.endsWith("tar.bz2")) {
            return tarBz2(archive, destDir);
        } else {
            return null;
        }
    }

    public static String addX(String exe) {
        return String.format("chmod +x %s", exe);
    }

    public static String make(String sourceDir) {
        return String.format("make -C %s", sourceDir);

    }

    public static String makeInstall(String destDir) {
        return String.format("make prefix=%s install", destDir);

    }

    public static String copy(String archive, String dir) {
        return String.format("cp %s %s", archive, dir);

    }

    public static String changeDir(String dir) {
        return String.format("cd %s", dir);
    }

    public static String runScript(File file) {
        return String.format("sh %s", file.toString());
    }

    public static String addPythonPath(String swDir, String pythonVer) {
        return String.format("export PYTHONPATH=%slib/python%s/site-packages:$PYTHONPATH", swDir, pythonVer);
    }

    public static String addPath(String path) {
        return String.format("export PATH=%s:$PATH", path);
    }

    private static String unzip(String file, String dir) {
        return String.format("unzip -o %s", file) + (dir == null ? "" : " -d " + dir);
    }

    private static String tarGz(String file, String dir) {
        return String.format("tar -zxvf %s --overwrite", file) + (dir == null ? "" : " -C " + dir);
    }

    private static String tarBz2(String file, String dir) {
        return String.format("tar -jxvf %s --overwrite", file) + (dir == null ? "" : " -C " + dir);
    }
}
