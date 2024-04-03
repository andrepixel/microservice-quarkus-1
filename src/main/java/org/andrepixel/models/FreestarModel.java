package org.andrepixel.models;

public class FreestarModel extends TicketModel {
    private Boolean isIMax;

    public FreestarModel() {
        super();
    }

    public Boolean getIsIMAX() {
        return isIMax;
    }

    public void setIsIMAX(Boolean isIMax) {
        this.isIMax = isIMax;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((isIMax == null) ? 0
                        : isIMax.hashCode());
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
        FreestarModel other = (FreestarModel) obj;
        if (isIMax == null) {
            if (other.isIMax != null)
                return false;
        } else if (!isIMax.equals(other.isIMax))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FreestarModel ["
                + super.toString() + ", isIMax="
                + isIMax + "]";
    }
}
