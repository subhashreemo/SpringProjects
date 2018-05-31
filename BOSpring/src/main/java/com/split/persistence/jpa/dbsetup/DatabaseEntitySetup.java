package com.split.persistence.jpa.dbsetup;

public class DatabaseEntitySetup {
	//Inner helper class to maintain db entity details
	static class EntityDetail {
		private String entityName;
		private String schema;
		private String type;
		private String resourceName;

		public EntityDetail(String schema, String entity, String type, String resourceName) {

			this.schema = schema;
			this.entityName = entity;
			this.type = type;
			this.resourceName = resourceName;
		}

		@Override
		public String toString() {
			return "EntityDetail [" + schema + "." + entityName + ", type=" + type + "]";
		}

		public String getEntityName() {
			return entityName;
		}

		public String getSchema() {
			return schema;
		}

		public String getType() {
			return type;
		}

		public String getSqlScriptResourceName() {
			return resourceName;

		}

	}
}
