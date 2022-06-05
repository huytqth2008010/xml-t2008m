package download;

public class Dependency {
    private String groupId;
    private String artifactId;
    private String version;

    public Dependency() {

    }

    public Dependency(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private static final  String linkFormat = "https://repo1.maven.org/maveb2/%s/%s/%s/%s";

    public String getDownloadLink(){
        String groupIdWithSlash = groupId.replace(".","/");
        return  String.format(linkFormat, groupIdWithSlash, artifactId,version,getFileName());

    }
    private static final String nameFormat = "%s-%s.jar";

    public String getFileName(){
        return String.format(nameFormat,artifactId,version);
    }
}
