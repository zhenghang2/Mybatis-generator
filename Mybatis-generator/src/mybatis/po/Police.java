package mybatis.po;

import java.util.Date;

public class Police {
    private Integer poliId;

    private String poliCode;

    private String poliName;

    private String poliPass;

    private String poliRole;

    private String poliPhoto;

    private String poliDistrict;

    private Date timeLastlogin;

    private String ipLastlogin;

    private Boolean isDeleted;

    private String ramark;

    private Integer statId;

    public Integer getPoliId() {
        return poliId;
    }

    public void setPoliId(Integer poliId) {
        this.poliId = poliId;
    }

    public String getPoliCode() {
        return poliCode;
    }

    public void setPoliCode(String poliCode) {
        this.poliCode = poliCode == null ? null : poliCode.trim();
    }

    public String getPoliName() {
        return poliName;
    }

    public void setPoliName(String poliName) {
        this.poliName = poliName == null ? null : poliName.trim();
    }

    public String getPoliPass() {
        return poliPass;
    }

    public void setPoliPass(String poliPass) {
        this.poliPass = poliPass == null ? null : poliPass.trim();
    }

    public String getPoliRole() {
        return poliRole;
    }

    public void setPoliRole(String poliRole) {
        this.poliRole = poliRole == null ? null : poliRole.trim();
    }

    public String getPoliPhoto() {
        return poliPhoto;
    }

    public void setPoliPhoto(String poliPhoto) {
        this.poliPhoto = poliPhoto == null ? null : poliPhoto.trim();
    }

    public String getPoliDistrict() {
        return poliDistrict;
    }

    public void setPoliDistrict(String poliDistrict) {
        this.poliDistrict = poliDistrict == null ? null : poliDistrict.trim();
    }

    public Date getTimeLastlogin() {
        return timeLastlogin;
    }

    public void setTimeLastlogin(Date timeLastlogin) {
        this.timeLastlogin = timeLastlogin;
    }

    public String getIpLastlogin() {
        return ipLastlogin;
    }

    public void setIpLastlogin(String ipLastlogin) {
        this.ipLastlogin = ipLastlogin == null ? null : ipLastlogin.trim();
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

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }
}