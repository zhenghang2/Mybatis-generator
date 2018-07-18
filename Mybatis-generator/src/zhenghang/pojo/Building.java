package zhenghang.pojo;

public class Building {
    private Integer builId;

    private Integer commId;

    private Integer poliId;

    private String builName;

    private String builGpse;

    private String builGpsn;

    private String builType;

    private Boolean isDeleted;

    private String ramark;

    private String builAddr;

    public Integer getBuilId() {
        return builId;
    }

    public void setBuilId(Integer builId) {
        this.builId = builId;
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public Integer getPoliId() {
        return poliId;
    }

    public void setPoliId(Integer poliId) {
        this.poliId = poliId;
    }

    public String getBuilName() {
        return builName;
    }

    public void setBuilName(String builName) {
        this.builName = builName == null ? null : builName.trim();
    }

    public String getBuilGpse() {
        return builGpse;
    }

    public void setBuilGpse(String builGpse) {
        this.builGpse = builGpse == null ? null : builGpse.trim();
    }

    public String getBuilGpsn() {
        return builGpsn;
    }

    public void setBuilGpsn(String builGpsn) {
        this.builGpsn = builGpsn == null ? null : builGpsn.trim();
    }

    public String getBuilType() {
        return builType;
    }

    public void setBuilType(String builType) {
        this.builType = builType == null ? null : builType.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRamark() {
        return ramark;
    }

    public void setRamark(String ramark) {
        this.ramark = ramark == null ? null : ramark.trim();
    }

    public String getBuilAddr() {
        return builAddr;
    }

    public void setBuilAddr(String builAddr) {
        this.builAddr = builAddr == null ? null : builAddr.trim();
    }
}