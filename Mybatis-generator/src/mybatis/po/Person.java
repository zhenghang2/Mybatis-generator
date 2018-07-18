package mybatis.po;

import java.util.Date;

public class Person {
    private Integer persId;

    private Integer roomId;

    private String persName;

    private Boolean persSex;

    private String persIdcard;

    private String persPhone;

    private Date timeRegister;

    private String whyRegister;

    private String addrCensus;

    private String addrLive;

    private String addrWork;

    private Boolean isFocus;

    private Boolean isDeleted;

    private String ramark;

    private Integer persType;

    private String persPhoto;

    public Integer getPersId() {
        return persId;
    }

    public void setPersId(Integer persId) {
        this.persId = persId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getPersName() {
        return persName;
    }

    public void setPersName(String persName) {
        this.persName = persName == null ? null : persName.trim();
    }

    public Boolean getPersSex() {
        return persSex;
    }

    public void setPersSex(Boolean persSex) {
        this.persSex = persSex;
    }

    public String getPersIdcard() {
        return persIdcard;
    }

    public void setPersIdcard(String persIdcard) {
        this.persIdcard = persIdcard == null ? null : persIdcard.trim();
    }

    public String getPersPhone() {
        return persPhone;
    }

    public void setPersPhone(String persPhone) {
        this.persPhone = persPhone == null ? null : persPhone.trim();
    }

    public Date getTimeRegister() {
        return timeRegister;
    }

    public void setTimeRegister(Date timeRegister) {
        this.timeRegister = timeRegister;
    }

    public String getWhyRegister() {
        return whyRegister;
    }

    public void setWhyRegister(String whyRegister) {
        this.whyRegister = whyRegister == null ? null : whyRegister.trim();
    }

    public String getAddrCensus() {
        return addrCensus;
    }

    public void setAddrCensus(String addrCensus) {
        this.addrCensus = addrCensus == null ? null : addrCensus.trim();
    }

    public String getAddrLive() {
        return addrLive;
    }

    public void setAddrLive(String addrLive) {
        this.addrLive = addrLive == null ? null : addrLive.trim();
    }

    public String getAddrWork() {
        return addrWork;
    }

    public void setAddrWork(String addrWork) {
        this.addrWork = addrWork == null ? null : addrWork.trim();
    }

    public Boolean getIsFocus() {
        return isFocus;
    }

    public void setIsFocus(Boolean isFocus) {
        this.isFocus = isFocus;
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

    public Integer getPersType() {
        return persType;
    }

    public void setPersType(Integer persType) {
        this.persType = persType;
    }

    public String getPersPhoto() {
        return persPhoto;
    }

    public void setPersPhoto(String persPhoto) {
        this.persPhoto = persPhoto == null ? null : persPhoto.trim();
    }
}