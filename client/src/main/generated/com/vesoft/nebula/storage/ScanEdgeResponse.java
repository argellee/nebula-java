/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ScanEdgeResponse implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ScanEdgeResponse");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField EDGE_SCHEMA_FIELD_DESC = new TField("edge_schema", TType.MAP, (short)2);
  private static final TField EDGE_DATA_FIELD_DESC = new TField("edge_data", TType.LIST, (short)3);
  private static final TField HAS_NEXT_FIELD_DESC = new TField("has_next", TType.BOOL, (short)4);
  private static final TField NEXT_CURSOR_FIELD_DESC = new TField("next_cursor", TType.STRING, (short)5);

  public ResponseCommon result;
  public Map<Integer,com.vesoft.nebula.Schema> edge_schema;
  public List<ScanEdge> edge_data;
  public boolean has_next;
  public byte[] next_cursor;
  public static final int RESULT = 1;
  public static final int EDGE_SCHEMA = 2;
  public static final int EDGE_DATA = 3;
  public static final int HAS_NEXT = 4;
  public static final int NEXT_CURSOR = 5;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __HAS_NEXT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(EDGE_SCHEMA, new FieldMetaData("edge_schema", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.Schema.class))));
    tmpMetaDataMap.put(EDGE_DATA, new FieldMetaData("edge_data", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, ScanEdge.class))));
    tmpMetaDataMap.put(HAS_NEXT, new FieldMetaData("has_next", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(NEXT_CURSOR, new FieldMetaData("next_cursor", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ScanEdgeResponse.class, metaDataMap);
  }

  public ScanEdgeResponse() {
  }

  public ScanEdgeResponse(
    ResponseCommon result)
  {
    this();
    this.result = result;
  }

  public ScanEdgeResponse(
    ResponseCommon result,
    Map<Integer,com.vesoft.nebula.Schema> edge_schema,
    List<ScanEdge> edge_data,
    boolean has_next,
    byte[] next_cursor)
  {
    this();
    this.result = result;
    this.edge_schema = edge_schema;
    this.edge_data = edge_data;
    this.has_next = has_next;
    setHas_nextIsSet(true);
    this.next_cursor = next_cursor;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanEdgeResponse(ScanEdgeResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetEdge_schema()) {
      this.edge_schema = TBaseHelper.deepCopy(other.edge_schema);
    }
    if (other.isSetEdge_data()) {
      this.edge_data = TBaseHelper.deepCopy(other.edge_data);
    }
    this.has_next = TBaseHelper.deepCopy(other.has_next);
    if (other.isSetNext_cursor()) {
      this.next_cursor = TBaseHelper.deepCopy(other.next_cursor);
    }
  }

  public ScanEdgeResponse deepCopy() {
    return new ScanEdgeResponse(this);
  }

  @Deprecated
  public ScanEdgeResponse clone() {
    return new ScanEdgeResponse(this);
  }

  public ResponseCommon  getResult() {
    return this.result;
  }

  public ScanEdgeResponse setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public Map<Integer,com.vesoft.nebula.Schema>  getEdge_schema() {
    return this.edge_schema;
  }

  public ScanEdgeResponse setEdge_schema(Map<Integer,com.vesoft.nebula.Schema> edge_schema) {
    this.edge_schema = edge_schema;
    return this;
  }

  public void unsetEdge_schema() {
    this.edge_schema = null;
  }

  // Returns true if field edge_schema is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_schema() {
    return this.edge_schema != null;
  }

  public void setEdge_schemaIsSet(boolean value) {
    if (!value) {
      this.edge_schema = null;
    }
  }

  public List<ScanEdge>  getEdge_data() {
    return this.edge_data;
  }

  public ScanEdgeResponse setEdge_data(List<ScanEdge> edge_data) {
    this.edge_data = edge_data;
    return this;
  }

  public void unsetEdge_data() {
    this.edge_data = null;
  }

  // Returns true if field edge_data is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_data() {
    return this.edge_data != null;
  }

  public void setEdge_dataIsSet(boolean value) {
    if (!value) {
      this.edge_data = null;
    }
  }

  public boolean  isHas_next() {
    return this.has_next;
  }

  public ScanEdgeResponse setHas_next(boolean has_next) {
    this.has_next = has_next;
    setHas_nextIsSet(true);
    return this;
  }

  public void unsetHas_next() {
    __isset_bit_vector.clear(__HAS_NEXT_ISSET_ID);
  }

  // Returns true if field has_next is set (has been assigned a value) and false otherwise
  public boolean isSetHas_next() {
    return __isset_bit_vector.get(__HAS_NEXT_ISSET_ID);
  }

  public void setHas_nextIsSet(boolean value) {
    __isset_bit_vector.set(__HAS_NEXT_ISSET_ID, value);
  }

  public byte[]  getNext_cursor() {
    return this.next_cursor;
  }

  public ScanEdgeResponse setNext_cursor(byte[] next_cursor) {
    this.next_cursor = next_cursor;
    return this;
  }

  public void unsetNext_cursor() {
    this.next_cursor = null;
  }

  // Returns true if field next_cursor is set (has been assigned a value) and false otherwise
  public boolean isSetNext_cursor() {
    return this.next_cursor != null;
  }

  public void setNext_cursorIsSet(boolean value) {
    if (!value) {
      this.next_cursor = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)value);
      }
      break;

    case EDGE_SCHEMA:
      if (value == null) {
        unsetEdge_schema();
      } else {
        setEdge_schema((Map<Integer,com.vesoft.nebula.Schema>)value);
      }
      break;

    case EDGE_DATA:
      if (value == null) {
        unsetEdge_data();
      } else {
        setEdge_data((List<ScanEdge>)value);
      }
      break;

    case HAS_NEXT:
      if (value == null) {
        unsetHas_next();
      } else {
        setHas_next((Boolean)value);
      }
      break;

    case NEXT_CURSOR:
      if (value == null) {
        unsetNext_cursor();
      } else {
        setNext_cursor((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case EDGE_SCHEMA:
      return getEdge_schema();

    case EDGE_DATA:
      return getEdge_data();

    case HAS_NEXT:
      return new Boolean(isHas_next());

    case NEXT_CURSOR:
      return getNext_cursor();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return isSetResult();
    case EDGE_SCHEMA:
      return isSetEdge_schema();
    case EDGE_DATA:
      return isSetEdge_data();
    case HAS_NEXT:
      return isSetHas_next();
    case NEXT_CURSOR:
      return isSetNext_cursor();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScanEdgeResponse)
      return this.equals((ScanEdgeResponse)that);
    return false;
  }

  public boolean equals(ScanEdgeResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!TBaseHelper.equalsNobinary(this.result, that.result))
        return false;
    }

    boolean this_present_edge_schema = true && this.isSetEdge_schema();
    boolean that_present_edge_schema = true && that.isSetEdge_schema();
    if (this_present_edge_schema || that_present_edge_schema) {
      if (!(this_present_edge_schema && that_present_edge_schema))
        return false;
      if (!TBaseHelper.equalsNobinary(this.edge_schema, that.edge_schema))
        return false;
    }

    boolean this_present_edge_data = true && this.isSetEdge_data();
    boolean that_present_edge_data = true && that.isSetEdge_data();
    if (this_present_edge_data || that_present_edge_data) {
      if (!(this_present_edge_data && that_present_edge_data))
        return false;
      if (!TBaseHelper.equalsNobinary(this.edge_data, that.edge_data))
        return false;
    }

    boolean this_present_has_next = true;
    boolean that_present_has_next = true;
    if (this_present_has_next || that_present_has_next) {
      if (!(this_present_has_next && that_present_has_next))
        return false;
      if (!TBaseHelper.equalsNobinary(this.has_next, that.has_next))
        return false;
    }

    boolean this_present_next_cursor = true && this.isSetNext_cursor();
    boolean that_present_next_cursor = true && that.isSetNext_cursor();
    if (this_present_next_cursor || that_present_next_cursor) {
      if (!(this_present_next_cursor && that_present_next_cursor))
        return false;
      if (!TBaseHelper.equalsSlow(this.next_cursor, that.next_cursor))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_result = true && (isSetResult());
    builder.append(present_result);
    if (present_result)
      builder.append(result);

    boolean present_edge_schema = true && (isSetEdge_schema());
    builder.append(present_edge_schema);
    if (present_edge_schema)
      builder.append(edge_schema);

    boolean present_edge_data = true && (isSetEdge_data());
    builder.append(present_edge_data);
    if (present_edge_data)
      builder.append(edge_data);

    boolean present_has_next = true;
    builder.append(present_has_next);
    if (present_has_next)
      builder.append(has_next);

    boolean present_next_cursor = true && (isSetNext_cursor());
    builder.append(present_next_cursor);
    if (present_next_cursor)
      builder.append(next_cursor);

    return builder.toHashCode();
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case RESULT:
          if (field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EDGE_SCHEMA:
          if (field.type == TType.MAP) {
            {
              TMap _map151 = iprot.readMapBegin();
              this.edge_schema = new HashMap<Integer,com.vesoft.nebula.Schema>(Math.max(0, 2*_map151.size));
              for (int _i152 = 0; 
                   (_map151.size < 0) ? iprot.peekMap() : (_i152 < _map151.size); 
                   ++_i152)
              {
                int _key153;
                com.vesoft.nebula.Schema _val154;
                _key153 = iprot.readI32();
                _val154 = new com.vesoft.nebula.Schema();
                _val154.read(iprot);
                this.edge_schema.put(_key153, _val154);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EDGE_DATA:
          if (field.type == TType.LIST) {
            {
              TList _list155 = iprot.readListBegin();
              this.edge_data = new ArrayList<ScanEdge>(Math.max(0, _list155.size));
              for (int _i156 = 0; 
                   (_list155.size < 0) ? iprot.peekList() : (_i156 < _list155.size); 
                   ++_i156)
              {
                ScanEdge _elem157;
                _elem157 = new ScanEdge();
                _elem157.read(iprot);
                this.edge_data.add(_elem157);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case HAS_NEXT:
          if (field.type == TType.BOOL) {
            this.has_next = iprot.readBool();
            setHas_nextIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NEXT_CURSOR:
          if (field.type == TType.STRING) {
            this.next_cursor = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.edge_schema != null) {
      oprot.writeFieldBegin(EDGE_SCHEMA_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.edge_schema.size()));
        for (Map.Entry<Integer, com.vesoft.nebula.Schema> _iter158 : this.edge_schema.entrySet())        {
          oprot.writeI32(_iter158.getKey());
          _iter158.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.edge_data != null) {
      oprot.writeFieldBegin(EDGE_DATA_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.edge_data.size()));
        for (ScanEdge _iter159 : this.edge_data)        {
          _iter159.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
    oprot.writeBool(this.has_next);
    oprot.writeFieldEnd();
    if (this.next_cursor != null) {
      oprot.writeFieldBegin(NEXT_CURSOR_FIELD_DESC);
      oprot.writeBinary(this.next_cursor);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ScanEdgeResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("edge_schema");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getEdge_schema() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getEdge_schema(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("edge_data");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getEdge_data() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getEdge_data(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("has_next");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isHas_next(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("next_cursor");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getNext_cursor() == null) {
      sb.append("null");
    } else {
        int __next_cursor_size = Math.min(this. getNext_cursor().length, 128);
        for (int i = 0; i < __next_cursor_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getNext_cursor()[i]).length() > 1 ? Integer.toHexString(this. getNext_cursor()[i]).substring(Integer.toHexString(this. getNext_cursor()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getNext_cursor()[i]).toUpperCase());
        }
        if (this. getNext_cursor().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
    // check that fields of type enum have valid values
  }

}

