package com.example.tapti.firstapplication;

    import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;

public class Symptom {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    @Override
    public String toString() {
        return "Symptom{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
