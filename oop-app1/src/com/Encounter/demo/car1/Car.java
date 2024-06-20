package com.Encounter.demo.car1;

/**
 * @author Encounter
 * @date 2024/6/17 22:49
 */
public class Car
    {
        private String models;
        private String licensePlate;

        public Car()
            {
            }

        public Car(String models, String licensePlate)
            {
                this.models = models;
                this.licensePlate = licensePlate;
            }

        public String getModels()
            {
                return models;
            }

        public void setModels(String models)
            {
                this.models = models;
            }

        public String getLicensePlate()
            {
                return licensePlate;
            }

        public void setLicensePlate(String licensePlate)
            {
                this.licensePlate = licensePlate;
            }
    }
