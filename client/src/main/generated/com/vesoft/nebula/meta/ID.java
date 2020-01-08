/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

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

@SuppressWarnings({ "unused", "serial", "unchecked" })
public class ID extends TUnion<ID> implements Comparable<ID> {
  public static boolean DEFAULT_PRETTY_PRINT = true;
  private static final TStruct STRUCT_DESC = new TStruct("ID");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField TAG_ID_FIELD_DESC = new TField("tag_id", TType.I32, (short)2);
  private static final TField EDGE_TYPE_FIELD_DESC = new TField("edge_type", TType.I32, (short)3);
  private static final TField TAG_INDEX_ID_FIELD_DESC = new TField("tag_index_id", TType.I32, (short)4);
  private static final TField EDGE_INDEX_ID_FIELD_DESC = new TField("edge_index_id", TType.I32, (short)5);
  private static final TField USER_ID_FIELD_DESC = new TField("user_id", TType.I32, (short)6);
  private static final TField CLUSTER_ID_FIELD_DESC = new TField("cluster_id", TType.I64, (short)7);

  public static final int SPACE_ID = 1;
  public static final int TAG_ID = 2;
  public static final int EDGE_TYPE = 3;
  public static final int TAG_INDEX_ID = 4;
  public static final int EDGE_INDEX_ID = 5;
  public static final int USER_ID = 6;
  public static final int CLUSTER_ID = 7;

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(TAG_ID, new FieldMetaData("tag_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(EDGE_TYPE, new FieldMetaData("edge_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(TAG_INDEX_ID, new FieldMetaData("tag_index_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(EDGE_INDEX_ID, new FieldMetaData("edge_index_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(USER_ID, new FieldMetaData("user_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(CLUSTER_ID, new FieldMetaData("cluster_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public ID() {
    super();
  }

  public ID(int setField, Object value) {
    super(setField, value);
  }

  public ID(ID other) {
    super(other);
  }
  public ID deepCopy() {
    return new ID(this);
  }

  public static ID space_id(int value) {
    ID x = new ID();
    x.setSpace_id(value);
    return x;
  }

  public static ID tag_id(int value) {
    ID x = new ID();
    x.setTag_id(value);
    return x;
  }

  public static ID edge_type(int value) {
    ID x = new ID();
    x.setEdge_type(value);
    return x;
  }

  public static ID tag_index_id(int value) {
    ID x = new ID();
    x.setTag_index_id(value);
    return x;
  }

  public static ID edge_index_id(int value) {
    ID x = new ID();
    x.setEdge_index_id(value);
    return x;
  }

  public static ID user_id(int value) {
    ID x = new ID();
    x.setUser_id(value);
    return x;
  }

  public static ID cluster_id(long value) {
    ID x = new ID();
    x.setCluster_id(value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object value) throws ClassCastException {
    switch (setField) {
      case SPACE_ID:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'space_id', but got " + value.getClass().getSimpleName());
      case TAG_ID:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'tag_id', but got " + value.getClass().getSimpleName());
      case EDGE_TYPE:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'edge_type', but got " + value.getClass().getSimpleName());
      case TAG_INDEX_ID:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'tag_index_id', but got " + value.getClass().getSimpleName());
      case EDGE_INDEX_ID:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'edge_index_id', but got " + value.getClass().getSimpleName());
      case USER_ID:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'user_id', but got " + value.getClass().getSimpleName());
      case CLUSTER_ID:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'cluster_id', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  public void read(TProtocol iprot) throws TException {
    setField_ = 0;
    value_ = null;
    iprot.readStructBegin(metaDataMap);
    TField field = iprot.readFieldBegin();
    if (field.type != TType.STOP)
    {
      value_ = readValue(iprot, field);
      if (value_ != null)
      {
        switch (field.id) {
          case SPACE_ID:
            if (field.type == SPACE_ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case TAG_ID:
            if (field.type == TAG_ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case EDGE_TYPE:
            if (field.type == EDGE_TYPE_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case TAG_INDEX_ID:
            if (field.type == TAG_INDEX_ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case EDGE_INDEX_ID:
            if (field.type == EDGE_INDEX_ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case USER_ID:
            if (field.type == USER_ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case CLUSTER_ID:
            if (field.type == CLUSTER_ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
        }
      }
      iprot.readFieldEnd();
      iprot.readFieldBegin();
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  @Override
  protected Object readValue(TProtocol iprot, TField field) throws TException {
    switch (field.id) {
      case SPACE_ID:
        if (field.type == SPACE_ID_FIELD_DESC.type) {
          Integer space_id;
          space_id = iprot.readI32();
          return space_id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case TAG_ID:
        if (field.type == TAG_ID_FIELD_DESC.type) {
          Integer tag_id;
          tag_id = iprot.readI32();
          return tag_id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case EDGE_TYPE:
        if (field.type == EDGE_TYPE_FIELD_DESC.type) {
          Integer edge_type;
          edge_type = iprot.readI32();
          return edge_type;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case TAG_INDEX_ID:
        if (field.type == TAG_INDEX_ID_FIELD_DESC.type) {
          Integer tag_index_id;
          tag_index_id = iprot.readI32();
          return tag_index_id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case EDGE_INDEX_ID:
        if (field.type == EDGE_INDEX_ID_FIELD_DESC.type) {
          Integer edge_index_id;
          edge_index_id = iprot.readI32();
          return edge_index_id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case USER_ID:
        if (field.type == USER_ID_FIELD_DESC.type) {
          Integer user_id;
          user_id = iprot.readI32();
          return user_id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case CLUSTER_ID:
        if (field.type == CLUSTER_ID_FIELD_DESC.type) {
          Long cluster_id;
          cluster_id = iprot.readI64();
          return cluster_id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      default:
        TProtocolUtil.skip(iprot, field.type);
        return null;
    }
  }

  @Override
  protected void writeValue(TProtocol oprot, short setField, Object value) throws TException {
    switch (setField) {
      case SPACE_ID:
        Integer space_id = (Integer)getFieldValue();
        oprot.writeI32(space_id);
        return;
      case TAG_ID:
        Integer tag_id = (Integer)getFieldValue();
        oprot.writeI32(tag_id);
        return;
      case EDGE_TYPE:
        Integer edge_type = (Integer)getFieldValue();
        oprot.writeI32(edge_type);
        return;
      case TAG_INDEX_ID:
        Integer tag_index_id = (Integer)getFieldValue();
        oprot.writeI32(tag_index_id);
        return;
      case EDGE_INDEX_ID:
        Integer edge_index_id = (Integer)getFieldValue();
        oprot.writeI32(edge_index_id);
        return;
      case USER_ID:
        Integer user_id = (Integer)getFieldValue();
        oprot.writeI32(user_id);
        return;
      case CLUSTER_ID:
        Long cluster_id = (Long)getFieldValue();
        oprot.writeI64(cluster_id);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case SPACE_ID:
        return SPACE_ID_FIELD_DESC;
      case TAG_ID:
        return TAG_ID_FIELD_DESC;
      case EDGE_TYPE:
        return EDGE_TYPE_FIELD_DESC;
      case TAG_INDEX_ID:
        return TAG_INDEX_ID_FIELD_DESC;
      case EDGE_INDEX_ID:
        return EDGE_INDEX_ID_FIELD_DESC;
      case USER_ID:
        return USER_ID_FIELD_DESC;
      case CLUSTER_ID:
        return CLUSTER_ID_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  public int  getSpace_id() {
    if (getSetField() == SPACE_ID) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'space_id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSpace_id(int value) {
    setField_ = SPACE_ID;
    value_ = value;
  }

  public int  getTag_id() {
    if (getSetField() == TAG_ID) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'tag_id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTag_id(int value) {
    setField_ = TAG_ID;
    value_ = value;
  }

  public int  getEdge_type() {
    if (getSetField() == EDGE_TYPE) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'edge_type' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setEdge_type(int value) {
    setField_ = EDGE_TYPE;
    value_ = value;
  }

  public int  getTag_index_id() {
    if (getSetField() == TAG_INDEX_ID) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'tag_index_id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTag_index_id(int value) {
    setField_ = TAG_INDEX_ID;
    value_ = value;
  }

  public int  getEdge_index_id() {
    if (getSetField() == EDGE_INDEX_ID) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'edge_index_id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setEdge_index_id(int value) {
    setField_ = EDGE_INDEX_ID;
    value_ = value;
  }

  public int  getUser_id() {
    if (getSetField() == USER_ID) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'user_id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUser_id(int value) {
    setField_ = USER_ID;
    value_ = value;
  }

  public long  getCluster_id() {
    if (getSetField() == CLUSTER_ID) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'cluster_id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setCluster_id(long value) {
    setField_ = CLUSTER_ID;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof ID) {
      return equals((ID)other);
    } else {
      return false;
    }
  }

  public boolean equals(ID other) {
    return equalsNobinaryImpl(other);
  }

  @Override
  public int compareTo(ID other) {
    return compareToImpl(other);
  }


  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(getSetField()).append(getFieldValue()).toHashCode();
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
    StringBuilder sb = new StringBuilder("ID");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    // Only print this field if it is the set field
    if (getSetField() == SPACE_ID)
    {
      sb.append(indentStr);
      sb.append("space_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == TAG_ID)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("tag_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getTag_id(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == EDGE_TYPE)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_type");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getEdge_type(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == TAG_INDEX_ID)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("tag_index_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getTag_index_id(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == EDGE_INDEX_ID)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_index_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getEdge_index_id(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == USER_ID)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("user_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getUser_id(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == CLUSTER_ID)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("cluster_id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getCluster_id(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }


}
