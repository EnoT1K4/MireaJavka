public class Computer {
    protected int frequency;
    protected int coresCount;
    protected int ramSize;
    protected int hddSize;

    public Computer(int frequency, int coresCount, int ramSize, int hddSize) {
        this.frequency = frequency;
        this.coresCount = coresCount;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
    }

    public double price() {
        return (frequency * coresCount / 100.0 + ramSize / 80.0 + hddSize / 20.0);
    }

    public boolean isSuitableForUse() {
        if ((frequency >= 2000) && (coresCount >= 2) && (ramSize >= 2048) && (hddSize >= 320))
            return true;
        else
            return false;
    }

    public String info() {
        return "Computer:\n" +
                "  frequency: " + frequency + " MHz\n" +
                "  cores: " + coresCount + "\n" +
                "  RAM: " + ramSize + " MB\n" +
                "  HDD: " + hddSize + " GB\n" +
                "  price: " + price() + "$\n" +
                (isSuitableForUse() ? "  is suitable for use" : "  is not suitable for use");
    }
}
