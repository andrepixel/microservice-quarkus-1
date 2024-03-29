package org.andrepixel.models;

public class ConstellationModel
        extends TicketModel {
    private Boolean recliningSeatType;

    public ConstellationModel() {
        super();
    }

    public Boolean getRecliningSeatType() {
        return recliningSeatType;
    }

    public void setRecliningSeatType(
            Boolean recliningSeatType) {
        this.recliningSeatType = recliningSeatType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((recliningSeatType == null) ? 0
                        : recliningSeatType
                                .hashCode());
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
        ConstellationModel other = (ConstellationModel) obj;
        if (recliningSeatType == null) {
            if (other.recliningSeatType != null)
                return false;
        } else if (!recliningSeatType
                .equals(other.recliningSeatType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ConstellationModel ["
                + super.toString()
                + ", recliningSeatType="
                + recliningSeatType + "]";
    }

}
