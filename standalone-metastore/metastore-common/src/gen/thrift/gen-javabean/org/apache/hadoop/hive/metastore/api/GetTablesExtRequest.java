/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetTablesExtRequest implements org.apache.thrift.TBase<GetTablesExtRequest, GetTablesExtRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetTablesExtRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTablesExtRequest");

  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("tableNamePattern", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField REQUESTED_FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("requestedFields", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField PROCESSOR_CAPABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("processorCapabilities", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField PROCESSOR_IDENTIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("processorIdentifier", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetTablesExtRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetTablesExtRequestTupleSchemeFactory());
  }

  private String catalog; // required
  private String database; // required
  private String tableNamePattern; // required
  private int requestedFields; // required
  private int limit; // optional
  private List<String> processorCapabilities; // optional
  private String processorIdentifier; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATALOG((short)1, "catalog"),
    DATABASE((short)2, "database"),
    TABLE_NAME_PATTERN((short)3, "tableNamePattern"),
    REQUESTED_FIELDS((short)4, "requestedFields"),
    LIMIT((short)5, "limit"),
    PROCESSOR_CAPABILITIES((short)6, "processorCapabilities"),
    PROCESSOR_IDENTIFIER((short)7, "processorIdentifier");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CATALOG
          return CATALOG;
        case 2: // DATABASE
          return DATABASE;
        case 3: // TABLE_NAME_PATTERN
          return TABLE_NAME_PATTERN;
        case 4: // REQUESTED_FIELDS
          return REQUESTED_FIELDS;
        case 5: // LIMIT
          return LIMIT;
        case 6: // PROCESSOR_CAPABILITIES
          return PROCESSOR_CAPABILITIES;
        case 7: // PROCESSOR_IDENTIFIER
          return PROCESSOR_IDENTIFIER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REQUESTEDFIELDS_ISSET_ID = 0;
  private static final int __LIMIT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LIMIT,_Fields.PROCESSOR_CAPABILITIES,_Fields.PROCESSOR_IDENTIFIER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME_PATTERN, new org.apache.thrift.meta_data.FieldMetaData("tableNamePattern", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUESTED_FIELDS, new org.apache.thrift.meta_data.FieldMetaData("requestedFields", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROCESSOR_CAPABILITIES, new org.apache.thrift.meta_data.FieldMetaData("processorCapabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PROCESSOR_IDENTIFIER, new org.apache.thrift.meta_data.FieldMetaData("processorIdentifier", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTablesExtRequest.class, metaDataMap);
  }

  public GetTablesExtRequest() {
  }

  public GetTablesExtRequest(
    String catalog,
    String database,
    String tableNamePattern,
    int requestedFields)
  {
    this();
    this.catalog = catalog;
    this.database = database;
    this.tableNamePattern = tableNamePattern;
    this.requestedFields = requestedFields;
    setRequestedFieldsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetTablesExtRequest(GetTablesExtRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
    if (other.isSetDatabase()) {
      this.database = other.database;
    }
    if (other.isSetTableNamePattern()) {
      this.tableNamePattern = other.tableNamePattern;
    }
    this.requestedFields = other.requestedFields;
    this.limit = other.limit;
    if (other.isSetProcessorCapabilities()) {
      List<String> __this__processorCapabilities = new ArrayList<String>(other.processorCapabilities);
      this.processorCapabilities = __this__processorCapabilities;
    }
    if (other.isSetProcessorIdentifier()) {
      this.processorIdentifier = other.processorIdentifier;
    }
  }

  public GetTablesExtRequest deepCopy() {
    return new GetTablesExtRequest(this);
  }

  @Override
  public void clear() {
    this.catalog = null;
    this.database = null;
    this.tableNamePattern = null;
    setRequestedFieldsIsSet(false);
    this.requestedFields = 0;
    setLimitIsSet(false);
    this.limit = 0;
    this.processorCapabilities = null;
    this.processorIdentifier = null;
  }

  public String getCatalog() {
    return this.catalog;
  }

  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  public String getDatabase() {
    return this.database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  public String getTableNamePattern() {
    return this.tableNamePattern;
  }

  public void setTableNamePattern(String tableNamePattern) {
    this.tableNamePattern = tableNamePattern;
  }

  public void unsetTableNamePattern() {
    this.tableNamePattern = null;
  }

  /** Returns true if field tableNamePattern is set (has been assigned a value) and false otherwise */
  public boolean isSetTableNamePattern() {
    return this.tableNamePattern != null;
  }

  public void setTableNamePatternIsSet(boolean value) {
    if (!value) {
      this.tableNamePattern = null;
    }
  }

  public int getRequestedFields() {
    return this.requestedFields;
  }

  public void setRequestedFields(int requestedFields) {
    this.requestedFields = requestedFields;
    setRequestedFieldsIsSet(true);
  }

  public void unsetRequestedFields() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTEDFIELDS_ISSET_ID);
  }

  /** Returns true if field requestedFields is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedFields() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUESTEDFIELDS_ISSET_ID);
  }

  public void setRequestedFieldsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTEDFIELDS_ISSET_ID, value);
  }

  public int getLimit() {
    return this.limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
  }

  public void unsetLimit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  public int getProcessorCapabilitiesSize() {
    return (this.processorCapabilities == null) ? 0 : this.processorCapabilities.size();
  }

  public java.util.Iterator<String> getProcessorCapabilitiesIterator() {
    return (this.processorCapabilities == null) ? null : this.processorCapabilities.iterator();
  }

  public void addToProcessorCapabilities(String elem) {
    if (this.processorCapabilities == null) {
      this.processorCapabilities = new ArrayList<String>();
    }
    this.processorCapabilities.add(elem);
  }

  public List<String> getProcessorCapabilities() {
    return this.processorCapabilities;
  }

  public void setProcessorCapabilities(List<String> processorCapabilities) {
    this.processorCapabilities = processorCapabilities;
  }

  public void unsetProcessorCapabilities() {
    this.processorCapabilities = null;
  }

  /** Returns true if field processorCapabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessorCapabilities() {
    return this.processorCapabilities != null;
  }

  public void setProcessorCapabilitiesIsSet(boolean value) {
    if (!value) {
      this.processorCapabilities = null;
    }
  }

  public String getProcessorIdentifier() {
    return this.processorIdentifier;
  }

  public void setProcessorIdentifier(String processorIdentifier) {
    this.processorIdentifier = processorIdentifier;
  }

  public void unsetProcessorIdentifier() {
    this.processorIdentifier = null;
  }

  /** Returns true if field processorIdentifier is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessorIdentifier() {
    return this.processorIdentifier != null;
  }

  public void setProcessorIdentifierIsSet(boolean value) {
    if (!value) {
      this.processorIdentifier = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((String)value);
      }
      break;

    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((String)value);
      }
      break;

    case TABLE_NAME_PATTERN:
      if (value == null) {
        unsetTableNamePattern();
      } else {
        setTableNamePattern((String)value);
      }
      break;

    case REQUESTED_FIELDS:
      if (value == null) {
        unsetRequestedFields();
      } else {
        setRequestedFields((Integer)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((Integer)value);
      }
      break;

    case PROCESSOR_CAPABILITIES:
      if (value == null) {
        unsetProcessorCapabilities();
      } else {
        setProcessorCapabilities((List<String>)value);
      }
      break;

    case PROCESSOR_IDENTIFIER:
      if (value == null) {
        unsetProcessorIdentifier();
      } else {
        setProcessorIdentifier((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATALOG:
      return getCatalog();

    case DATABASE:
      return getDatabase();

    case TABLE_NAME_PATTERN:
      return getTableNamePattern();

    case REQUESTED_FIELDS:
      return getRequestedFields();

    case LIMIT:
      return getLimit();

    case PROCESSOR_CAPABILITIES:
      return getProcessorCapabilities();

    case PROCESSOR_IDENTIFIER:
      return getProcessorIdentifier();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATALOG:
      return isSetCatalog();
    case DATABASE:
      return isSetDatabase();
    case TABLE_NAME_PATTERN:
      return isSetTableNamePattern();
    case REQUESTED_FIELDS:
      return isSetRequestedFields();
    case LIMIT:
      return isSetLimit();
    case PROCESSOR_CAPABILITIES:
      return isSetProcessorCapabilities();
    case PROCESSOR_IDENTIFIER:
      return isSetProcessorIdentifier();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetTablesExtRequest)
      return this.equals((GetTablesExtRequest)that);
    return false;
  }

  public boolean equals(GetTablesExtRequest that) {
    if (that == null)
      return false;

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    boolean this_present_tableNamePattern = true && this.isSetTableNamePattern();
    boolean that_present_tableNamePattern = true && that.isSetTableNamePattern();
    if (this_present_tableNamePattern || that_present_tableNamePattern) {
      if (!(this_present_tableNamePattern && that_present_tableNamePattern))
        return false;
      if (!this.tableNamePattern.equals(that.tableNamePattern))
        return false;
    }

    boolean this_present_requestedFields = true;
    boolean that_present_requestedFields = true;
    if (this_present_requestedFields || that_present_requestedFields) {
      if (!(this_present_requestedFields && that_present_requestedFields))
        return false;
      if (this.requestedFields != that.requestedFields)
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    boolean this_present_processorCapabilities = true && this.isSetProcessorCapabilities();
    boolean that_present_processorCapabilities = true && that.isSetProcessorCapabilities();
    if (this_present_processorCapabilities || that_present_processorCapabilities) {
      if (!(this_present_processorCapabilities && that_present_processorCapabilities))
        return false;
      if (!this.processorCapabilities.equals(that.processorCapabilities))
        return false;
    }

    boolean this_present_processorIdentifier = true && this.isSetProcessorIdentifier();
    boolean that_present_processorIdentifier = true && that.isSetProcessorIdentifier();
    if (this_present_processorIdentifier || that_present_processorIdentifier) {
      if (!(this_present_processorIdentifier && that_present_processorIdentifier))
        return false;
      if (!this.processorIdentifier.equals(that.processorIdentifier))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_catalog = true && (isSetCatalog());
    list.add(present_catalog);
    if (present_catalog)
      list.add(catalog);

    boolean present_database = true && (isSetDatabase());
    list.add(present_database);
    if (present_database)
      list.add(database);

    boolean present_tableNamePattern = true && (isSetTableNamePattern());
    list.add(present_tableNamePattern);
    if (present_tableNamePattern)
      list.add(tableNamePattern);

    boolean present_requestedFields = true;
    list.add(present_requestedFields);
    if (present_requestedFields)
      list.add(requestedFields);

    boolean present_limit = true && (isSetLimit());
    list.add(present_limit);
    if (present_limit)
      list.add(limit);

    boolean present_processorCapabilities = true && (isSetProcessorCapabilities());
    list.add(present_processorCapabilities);
    if (present_processorCapabilities)
      list.add(processorCapabilities);

    boolean present_processorIdentifier = true && (isSetProcessorIdentifier());
    list.add(present_processorIdentifier);
    if (present_processorIdentifier)
      list.add(processorIdentifier);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetTablesExtRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCatalog()).compareTo(other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDatabase()).compareTo(other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableNamePattern()).compareTo(other.isSetTableNamePattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableNamePattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableNamePattern, other.tableNamePattern);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestedFields()).compareTo(other.isSetRequestedFields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedFields()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestedFields, other.requestedFields);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProcessorCapabilities()).compareTo(other.isSetProcessorCapabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessorCapabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processorCapabilities, other.processorCapabilities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProcessorIdentifier()).compareTo(other.isSetProcessorIdentifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessorIdentifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processorIdentifier, other.processorIdentifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetTablesExtRequest(");
    boolean first = true;

    sb.append("catalog:");
    if (this.catalog == null) {
      sb.append("null");
    } else {
      sb.append(this.catalog);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("database:");
    if (this.database == null) {
      sb.append("null");
    } else {
      sb.append(this.database);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableNamePattern:");
    if (this.tableNamePattern == null) {
      sb.append("null");
    } else {
      sb.append(this.tableNamePattern);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestedFields:");
    sb.append(this.requestedFields);
    first = false;
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
      first = false;
    }
    if (isSetProcessorCapabilities()) {
      if (!first) sb.append(", ");
      sb.append("processorCapabilities:");
      if (this.processorCapabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.processorCapabilities);
      }
      first = false;
    }
    if (isSetProcessorIdentifier()) {
      if (!first) sb.append(", ");
      sb.append("processorIdentifier:");
      if (this.processorIdentifier == null) {
        sb.append("null");
      } else {
        sb.append(this.processorIdentifier);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCatalog()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'catalog' is unset! Struct:" + toString());
    }

    if (!isSetDatabase()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'database' is unset! Struct:" + toString());
    }

    if (!isSetTableNamePattern()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableNamePattern' is unset! Struct:" + toString());
    }

    if (!isSetRequestedFields()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestedFields' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetTablesExtRequestStandardSchemeFactory implements SchemeFactory {
    public GetTablesExtRequestStandardScheme getScheme() {
      return new GetTablesExtRequestStandardScheme();
    }
  }

  private static class GetTablesExtRequestStandardScheme extends StandardScheme<GetTablesExtRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetTablesExtRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalog = iprot.readString();
              struct.setCatalogIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database = iprot.readString();
              struct.setDatabaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_NAME_PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableNamePattern = iprot.readString();
              struct.setTableNamePatternIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUESTED_FIELDS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.requestedFields = iprot.readI32();
              struct.setRequestedFieldsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limit = iprot.readI32();
              struct.setLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROCESSOR_CAPABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list944 = iprot.readListBegin();
                struct.processorCapabilities = new ArrayList<String>(_list944.size);
                String _elem945;
                for (int _i946 = 0; _i946 < _list944.size; ++_i946)
                {
                  _elem945 = iprot.readString();
                  struct.processorCapabilities.add(_elem945);
                }
                iprot.readListEnd();
              }
              struct.setProcessorCapabilitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PROCESSOR_IDENTIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processorIdentifier = iprot.readString();
              struct.setProcessorIdentifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetTablesExtRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catalog != null) {
        oprot.writeFieldBegin(CATALOG_FIELD_DESC);
        oprot.writeString(struct.catalog);
        oprot.writeFieldEnd();
      }
      if (struct.database != null) {
        oprot.writeFieldBegin(DATABASE_FIELD_DESC);
        oprot.writeString(struct.database);
        oprot.writeFieldEnd();
      }
      if (struct.tableNamePattern != null) {
        oprot.writeFieldBegin(TABLE_NAME_PATTERN_FIELD_DESC);
        oprot.writeString(struct.tableNamePattern);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REQUESTED_FIELDS_FIELD_DESC);
      oprot.writeI32(struct.requestedFields);
      oprot.writeFieldEnd();
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI32(struct.limit);
        oprot.writeFieldEnd();
      }
      if (struct.processorCapabilities != null) {
        if (struct.isSetProcessorCapabilities()) {
          oprot.writeFieldBegin(PROCESSOR_CAPABILITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.processorCapabilities.size()));
            for (String _iter947 : struct.processorCapabilities)
            {
              oprot.writeString(_iter947);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.processorIdentifier != null) {
        if (struct.isSetProcessorIdentifier()) {
          oprot.writeFieldBegin(PROCESSOR_IDENTIFIER_FIELD_DESC);
          oprot.writeString(struct.processorIdentifier);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetTablesExtRequestTupleSchemeFactory implements SchemeFactory {
    public GetTablesExtRequestTupleScheme getScheme() {
      return new GetTablesExtRequestTupleScheme();
    }
  }

  private static class GetTablesExtRequestTupleScheme extends TupleScheme<GetTablesExtRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetTablesExtRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.catalog);
      oprot.writeString(struct.database);
      oprot.writeString(struct.tableNamePattern);
      oprot.writeI32(struct.requestedFields);
      BitSet optionals = new BitSet();
      if (struct.isSetLimit()) {
        optionals.set(0);
      }
      if (struct.isSetProcessorCapabilities()) {
        optionals.set(1);
      }
      if (struct.isSetProcessorIdentifier()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLimit()) {
        oprot.writeI32(struct.limit);
      }
      if (struct.isSetProcessorCapabilities()) {
        {
          oprot.writeI32(struct.processorCapabilities.size());
          for (String _iter948 : struct.processorCapabilities)
          {
            oprot.writeString(_iter948);
          }
        }
      }
      if (struct.isSetProcessorIdentifier()) {
        oprot.writeString(struct.processorIdentifier);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetTablesExtRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.catalog = iprot.readString();
      struct.setCatalogIsSet(true);
      struct.database = iprot.readString();
      struct.setDatabaseIsSet(true);
      struct.tableNamePattern = iprot.readString();
      struct.setTableNamePatternIsSet(true);
      struct.requestedFields = iprot.readI32();
      struct.setRequestedFieldsIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.limit = iprot.readI32();
        struct.setLimitIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list949 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.processorCapabilities = new ArrayList<String>(_list949.size);
          String _elem950;
          for (int _i951 = 0; _i951 < _list949.size; ++_i951)
          {
            _elem950 = iprot.readString();
            struct.processorCapabilities.add(_elem950);
          }
        }
        struct.setProcessorCapabilitiesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.processorIdentifier = iprot.readString();
        struct.setProcessorIdentifierIsSet(true);
      }
    }
  }

}
