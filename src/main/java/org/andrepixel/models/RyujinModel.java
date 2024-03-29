package org.andrepixel.models;

public class RyujinModel extends TicketModel {
    private Boolean isVIP;

    public RyujinModel() {
        super();
    }

    public Boolean getIsVIP() {
        return isVIP;
    }

    public void setIsVIP(Boolean isVIP) {
        this.isVIP = isVIP;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((isVIP == null) ? 0
                        : isVIP.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        RyujinModel other = (RyujinModel) obj;
        if (isVIP == null) {
            if (other.isVIP != null)
                return false;
        } else if (!isVIP.equals(other.isVIP))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RyujinModel [" + super.toString()
                + ", isVIP=" + isVIP + "]";
    }
}