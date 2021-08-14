public class phone {

    public static class Builder {
        private String frontPanel;
        private String backPanel;
        private String processor;
        private String camera;

        public Builder() {

        }

        public Phone build() {
            return new Phone(this);
        }
        public Builder frontPanel(string frontPanel) {
            this.frontPanel = frontPanel;
            return this;
        }

        public Builder backPanel(string backPanel) {
            this.backPanel = backPanel;
            return this;
        }

        public Builder processor(string processor) {
            this.processor = processor;
            return this;
        }

        public Builder camera(string camera) {
            this.camera = camera;
            return this;
        }
    }

    private String frontpanel;
    private String backpanel;
    private String processor;
    private String camera;

    private Phone(Builder builder) {
        this.frontPanel = builder.frontPanel;
        this.backPanel = builder.backPanel;
        this.processor = builder.processor;
        this.camera = builder.camera;
    }
    public String getFrontpanel() {
        return frontpanel;
    }
    public String getCamera() {
        return camera;
    }
    public String getProcessor() {
        return processor;
    }
    public String getBackpanel() {
        return backpanel;
    }
}
