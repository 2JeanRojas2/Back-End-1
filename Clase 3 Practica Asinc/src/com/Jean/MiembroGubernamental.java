package com.Jean;

public abstract class MiembroGubernamental {

        protected MiembroGubernamental sigMiembroGubernamental;

        public abstract void leerDocumento(String documento, int tipo);

        public MiembroGubernamental setSigMiembroGubernamental(MiembroGubernamental sigMiembroGubernamental) {
                this.sigMiembroGubernamental = sigMiembroGubernamental;
                return this;
        }

}
