/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package net.csdn.controller.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDB implements org.apache.thrift.TBase<CDB, CDB._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CDB");

  private static final org.apache.thrift.protocol.TField SQL_FIELD_DESC = new org.apache.thrift.protocol.TField("sql", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DB_HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("dbHost", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DB_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("dbPort", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DB_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbUserName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DB_PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("dbPassword", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DRIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("driver", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField("prefix", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CDBStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CDBTupleSchemeFactory());
  }

  public String sql; // required
  public String dbHost; // required
  public int dbPort; // required
  public String dbUserName; // required
  public String dbPassword; // required
  public String dbName; // required
  public CDBDriver driver; // required
  public String prefix; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQL((short)1, "sql"),
    DB_HOST((short)2, "dbHost"),
    DB_PORT((short)3, "dbPort"),
    DB_USER_NAME((short)4, "dbUserName"),
    DB_PASSWORD((short)5, "dbPassword"),
    DB_NAME((short)6, "dbName"),
    DRIVER((short)7, "driver"),
    PREFIX((short)8, "prefix");

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
        case 1: // SQL
          return SQL;
        case 2: // DB_HOST
          return DB_HOST;
        case 3: // DB_PORT
          return DB_PORT;
        case 4: // DB_USER_NAME
          return DB_USER_NAME;
        case 5: // DB_PASSWORD
          return DB_PASSWORD;
        case 6: // DB_NAME
          return DB_NAME;
        case 7: // DRIVER
          return DRIVER;
        case 8: // PREFIX
          return PREFIX;
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
  private static final int __DBPORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQL, new org.apache.thrift.meta_data.FieldMetaData("sql", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_HOST, new org.apache.thrift.meta_data.FieldMetaData("dbHost", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_PORT, new org.apache.thrift.meta_data.FieldMetaData("dbPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DB_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbUserName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("dbPassword", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DRIVER, new org.apache.thrift.meta_data.FieldMetaData("driver", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CDBDriver.class)));
    tmpMap.put(_Fields.PREFIX, new org.apache.thrift.meta_data.FieldMetaData("prefix", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CDB.class, metaDataMap);
  }

  public CDB() {
  }

  public CDB(
    String sql,
    String dbHost,
    int dbPort,
    String dbUserName,
    String dbPassword,
    String dbName,
    CDBDriver driver,
    String prefix)
  {
    this();
    this.sql = sql;
    this.dbHost = dbHost;
    this.dbPort = dbPort;
    setDbPortIsSet(true);
    this.dbUserName = dbUserName;
    this.dbPassword = dbPassword;
    this.dbName = dbName;
    this.driver = driver;
    this.prefix = prefix;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CDB(CDB other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSql()) {
      this.sql = other.sql;
    }
    if (other.isSetDbHost()) {
      this.dbHost = other.dbHost;
    }
    this.dbPort = other.dbPort;
    if (other.isSetDbUserName()) {
      this.dbUserName = other.dbUserName;
    }
    if (other.isSetDbPassword()) {
      this.dbPassword = other.dbPassword;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetDriver()) {
      this.driver = new CDBDriver(other.driver);
    }
    if (other.isSetPrefix()) {
      this.prefix = other.prefix;
    }
  }

  public CDB deepCopy() {
    return new CDB(this);
  }

  @Override
  public void clear() {
    this.sql = null;
    this.dbHost = null;
    setDbPortIsSet(false);
    this.dbPort = 0;
    this.dbUserName = null;
    this.dbPassword = null;
    this.dbName = null;
    this.driver = null;
    this.prefix = null;
  }

  public String getSql() {
    return this.sql;
  }

  public CDB setSql(String sql) {
    this.sql = sql;
    return this;
  }

  public void unsetSql() {
    this.sql = null;
  }

  /** Returns true if field sql is set (has been assigned a value) and false otherwise */
  public boolean isSetSql() {
    return this.sql != null;
  }

  public void setSqlIsSet(boolean value) {
    if (!value) {
      this.sql = null;
    }
  }

  public String getDbHost() {
    return this.dbHost;
  }

  public CDB setDbHost(String dbHost) {
    this.dbHost = dbHost;
    return this;
  }

  public void unsetDbHost() {
    this.dbHost = null;
  }

  /** Returns true if field dbHost is set (has been assigned a value) and false otherwise */
  public boolean isSetDbHost() {
    return this.dbHost != null;
  }

  public void setDbHostIsSet(boolean value) {
    if (!value) {
      this.dbHost = null;
    }
  }

  public int getDbPort() {
    return this.dbPort;
  }

  public CDB setDbPort(int dbPort) {
    this.dbPort = dbPort;
    setDbPortIsSet(true);
    return this;
  }

  public void unsetDbPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DBPORT_ISSET_ID);
  }

  /** Returns true if field dbPort is set (has been assigned a value) and false otherwise */
  public boolean isSetDbPort() {
    return EncodingUtils.testBit(__isset_bitfield, __DBPORT_ISSET_ID);
  }

  public void setDbPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DBPORT_ISSET_ID, value);
  }

  public String getDbUserName() {
    return this.dbUserName;
  }

  public CDB setDbUserName(String dbUserName) {
    this.dbUserName = dbUserName;
    return this;
  }

  public void unsetDbUserName() {
    this.dbUserName = null;
  }

  /** Returns true if field dbUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbUserName() {
    return this.dbUserName != null;
  }

  public void setDbUserNameIsSet(boolean value) {
    if (!value) {
      this.dbUserName = null;
    }
  }

  public String getDbPassword() {
    return this.dbPassword;
  }

  public CDB setDbPassword(String dbPassword) {
    this.dbPassword = dbPassword;
    return this;
  }

  public void unsetDbPassword() {
    this.dbPassword = null;
  }

  /** Returns true if field dbPassword is set (has been assigned a value) and false otherwise */
  public boolean isSetDbPassword() {
    return this.dbPassword != null;
  }

  public void setDbPasswordIsSet(boolean value) {
    if (!value) {
      this.dbPassword = null;
    }
  }

  public String getDbName() {
    return this.dbName;
  }

  public CDB setDbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public CDBDriver getDriver() {
    return this.driver;
  }

  public CDB setDriver(CDBDriver driver) {
    this.driver = driver;
    return this;
  }

  public void unsetDriver() {
    this.driver = null;
  }

  /** Returns true if field driver is set (has been assigned a value) and false otherwise */
  public boolean isSetDriver() {
    return this.driver != null;
  }

  public void setDriverIsSet(boolean value) {
    if (!value) {
      this.driver = null;
    }
  }

  public String getPrefix() {
    return this.prefix;
  }

  public CDB setPrefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public void unsetPrefix() {
    this.prefix = null;
  }

  /** Returns true if field prefix is set (has been assigned a value) and false otherwise */
  public boolean isSetPrefix() {
    return this.prefix != null;
  }

  public void setPrefixIsSet(boolean value) {
    if (!value) {
      this.prefix = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQL:
      if (value == null) {
        unsetSql();
      } else {
        setSql((String)value);
      }
      break;

    case DB_HOST:
      if (value == null) {
        unsetDbHost();
      } else {
        setDbHost((String)value);
      }
      break;

    case DB_PORT:
      if (value == null) {
        unsetDbPort();
      } else {
        setDbPort((Integer)value);
      }
      break;

    case DB_USER_NAME:
      if (value == null) {
        unsetDbUserName();
      } else {
        setDbUserName((String)value);
      }
      break;

    case DB_PASSWORD:
      if (value == null) {
        unsetDbPassword();
      } else {
        setDbPassword((String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case DRIVER:
      if (value == null) {
        unsetDriver();
      } else {
        setDriver((CDBDriver)value);
      }
      break;

    case PREFIX:
      if (value == null) {
        unsetPrefix();
      } else {
        setPrefix((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQL:
      return getSql();

    case DB_HOST:
      return getDbHost();

    case DB_PORT:
      return Integer.valueOf(getDbPort());

    case DB_USER_NAME:
      return getDbUserName();

    case DB_PASSWORD:
      return getDbPassword();

    case DB_NAME:
      return getDbName();

    case DRIVER:
      return getDriver();

    case PREFIX:
      return getPrefix();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQL:
      return isSetSql();
    case DB_HOST:
      return isSetDbHost();
    case DB_PORT:
      return isSetDbPort();
    case DB_USER_NAME:
      return isSetDbUserName();
    case DB_PASSWORD:
      return isSetDbPassword();
    case DB_NAME:
      return isSetDbName();
    case DRIVER:
      return isSetDriver();
    case PREFIX:
      return isSetPrefix();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CDB)
      return this.equals((CDB)that);
    return false;
  }

  public boolean equals(CDB that) {
    if (that == null)
      return false;

    boolean this_present_sql = true && this.isSetSql();
    boolean that_present_sql = true && that.isSetSql();
    if (this_present_sql || that_present_sql) {
      if (!(this_present_sql && that_present_sql))
        return false;
      if (!this.sql.equals(that.sql))
        return false;
    }

    boolean this_present_dbHost = true && this.isSetDbHost();
    boolean that_present_dbHost = true && that.isSetDbHost();
    if (this_present_dbHost || that_present_dbHost) {
      if (!(this_present_dbHost && that_present_dbHost))
        return false;
      if (!this.dbHost.equals(that.dbHost))
        return false;
    }

    boolean this_present_dbPort = true;
    boolean that_present_dbPort = true;
    if (this_present_dbPort || that_present_dbPort) {
      if (!(this_present_dbPort && that_present_dbPort))
        return false;
      if (this.dbPort != that.dbPort)
        return false;
    }

    boolean this_present_dbUserName = true && this.isSetDbUserName();
    boolean that_present_dbUserName = true && that.isSetDbUserName();
    if (this_present_dbUserName || that_present_dbUserName) {
      if (!(this_present_dbUserName && that_present_dbUserName))
        return false;
      if (!this.dbUserName.equals(that.dbUserName))
        return false;
    }

    boolean this_present_dbPassword = true && this.isSetDbPassword();
    boolean that_present_dbPassword = true && that.isSetDbPassword();
    if (this_present_dbPassword || that_present_dbPassword) {
      if (!(this_present_dbPassword && that_present_dbPassword))
        return false;
      if (!this.dbPassword.equals(that.dbPassword))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_driver = true && this.isSetDriver();
    boolean that_present_driver = true && that.isSetDriver();
    if (this_present_driver || that_present_driver) {
      if (!(this_present_driver && that_present_driver))
        return false;
      if (!this.driver.equals(that.driver))
        return false;
    }

    boolean this_present_prefix = true && this.isSetPrefix();
    boolean that_present_prefix = true && that.isSetPrefix();
    if (this_present_prefix || that_present_prefix) {
      if (!(this_present_prefix && that_present_prefix))
        return false;
      if (!this.prefix.equals(that.prefix))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CDB other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CDB typedOther = (CDB)other;

    lastComparison = Boolean.valueOf(isSetSql()).compareTo(typedOther.isSetSql());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSql()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sql, typedOther.sql);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbHost()).compareTo(typedOther.isSetDbHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbHost, typedOther.dbHost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbPort()).compareTo(typedOther.isSetDbPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbPort, typedOther.dbPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbUserName()).compareTo(typedOther.isSetDbUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbUserName, typedOther.dbUserName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbPassword()).compareTo(typedOther.isSetDbPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbPassword, typedOther.dbPassword);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(typedOther.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, typedOther.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDriver()).compareTo(typedOther.isSetDriver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDriver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.driver, typedOther.driver);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrefix()).compareTo(typedOther.isSetPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrefix()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prefix, typedOther.prefix);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CDB(");
    boolean first = true;

    sb.append("sql:");
    if (this.sql == null) {
      sb.append("null");
    } else {
      sb.append(this.sql);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbHost:");
    if (this.dbHost == null) {
      sb.append("null");
    } else {
      sb.append(this.dbHost);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbPort:");
    sb.append(this.dbPort);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbUserName:");
    if (this.dbUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbUserName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbPassword:");
    if (this.dbPassword == null) {
      sb.append("null");
    } else {
      sb.append(this.dbPassword);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("driver:");
    if (this.driver == null) {
      sb.append("null");
    } else {
      sb.append(this.driver);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("prefix:");
    if (this.prefix == null) {
      sb.append("null");
    } else {
      sb.append(this.prefix);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
    if (driver != null) {
      driver.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CDBStandardSchemeFactory implements SchemeFactory {
    public CDBStandardScheme getScheme() {
      return new CDBStandardScheme();
    }
  }

  private static class CDBStandardScheme extends StandardScheme<CDB> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CDB struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sql = iprot.readString();
              struct.setSqlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbHost = iprot.readString();
              struct.setDbHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DB_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dbPort = iprot.readI32();
              struct.setDbPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DB_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbUserName = iprot.readString();
              struct.setDbUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DB_PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbPassword = iprot.readString();
              struct.setDbPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DRIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.driver = new CDBDriver();
              struct.driver.read(iprot);
              struct.setDriverIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PREFIX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.prefix = iprot.readString();
              struct.setPrefixIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CDB struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sql != null) {
        oprot.writeFieldBegin(SQL_FIELD_DESC);
        oprot.writeString(struct.sql);
        oprot.writeFieldEnd();
      }
      if (struct.dbHost != null) {
        oprot.writeFieldBegin(DB_HOST_FIELD_DESC);
        oprot.writeString(struct.dbHost);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DB_PORT_FIELD_DESC);
      oprot.writeI32(struct.dbPort);
      oprot.writeFieldEnd();
      if (struct.dbUserName != null) {
        oprot.writeFieldBegin(DB_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.dbUserName);
        oprot.writeFieldEnd();
      }
      if (struct.dbPassword != null) {
        oprot.writeFieldBegin(DB_PASSWORD_FIELD_DESC);
        oprot.writeString(struct.dbPassword);
        oprot.writeFieldEnd();
      }
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.driver != null) {
        oprot.writeFieldBegin(DRIVER_FIELD_DESC);
        struct.driver.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.prefix != null) {
        oprot.writeFieldBegin(PREFIX_FIELD_DESC);
        oprot.writeString(struct.prefix);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CDBTupleSchemeFactory implements SchemeFactory {
    public CDBTupleScheme getScheme() {
      return new CDBTupleScheme();
    }
  }

  private static class CDBTupleScheme extends TupleScheme<CDB> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CDB struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSql()) {
        optionals.set(0);
      }
      if (struct.isSetDbHost()) {
        optionals.set(1);
      }
      if (struct.isSetDbPort()) {
        optionals.set(2);
      }
      if (struct.isSetDbUserName()) {
        optionals.set(3);
      }
      if (struct.isSetDbPassword()) {
        optionals.set(4);
      }
      if (struct.isSetDbName()) {
        optionals.set(5);
      }
      if (struct.isSetDriver()) {
        optionals.set(6);
      }
      if (struct.isSetPrefix()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetSql()) {
        oprot.writeString(struct.sql);
      }
      if (struct.isSetDbHost()) {
        oprot.writeString(struct.dbHost);
      }
      if (struct.isSetDbPort()) {
        oprot.writeI32(struct.dbPort);
      }
      if (struct.isSetDbUserName()) {
        oprot.writeString(struct.dbUserName);
      }
      if (struct.isSetDbPassword()) {
        oprot.writeString(struct.dbPassword);
      }
      if (struct.isSetDbName()) {
        oprot.writeString(struct.dbName);
      }
      if (struct.isSetDriver()) {
        struct.driver.write(oprot);
      }
      if (struct.isSetPrefix()) {
        oprot.writeString(struct.prefix);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CDB struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.sql = iprot.readString();
        struct.setSqlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dbHost = iprot.readString();
        struct.setDbHostIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dbPort = iprot.readI32();
        struct.setDbPortIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dbUserName = iprot.readString();
        struct.setDbUserNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.dbPassword = iprot.readString();
        struct.setDbPasswordIsSet(true);
      }
      if (incoming.get(5)) {
        struct.dbName = iprot.readString();
        struct.setDbNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.driver = new CDBDriver();
        struct.driver.read(iprot);
        struct.setDriverIsSet(true);
      }
      if (incoming.get(7)) {
        struct.prefix = iprot.readString();
        struct.setPrefixIsSet(true);
      }
    }
  }

}

