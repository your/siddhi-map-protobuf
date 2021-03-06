// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package io.siddhi.extension.map.protobuf.autogenerated;

/**
 * Protobuf type {@code ResponseWithList}
 */
public  final class ResponseWithList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResponseWithList)
    ResponseWithListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseWithList.newBuilder() to construct.
  private ResponseWithList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseWithList() {
    stringList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    intList_ = emptyIntList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseWithList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              stringList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            stringList_.add(s);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              intList_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            intList_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              intList_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              intList_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        stringList_ = stringList_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        intList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Sample.internal_static_ResponseWithList_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Sample.internal_static_ResponseWithList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ResponseWithList.class, Builder.class);
  }

  public static final int STRINGLIST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList stringList_;
  /**
   * <code>repeated string stringList = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStringListList() {
    return stringList_;
  }
  /**
   * <code>repeated string stringList = 1;</code>
   */
  public int getStringListCount() {
    return stringList_.size();
  }
  /**
   * <code>repeated string stringList = 1;</code>
   */
  public String getStringList(int index) {
    return stringList_.get(index);
  }
  /**
   * <code>repeated string stringList = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStringListBytes(int index) {
    return stringList_.getByteString(index);
  }

  public static final int INTLIST_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList intList_;
  /**
   * <code>repeated int32 intList = 2;</code>
   */
  public java.util.List<Integer>
      getIntListList() {
    return intList_;
  }
  /**
   * <code>repeated int32 intList = 2;</code>
   */
  public int getIntListCount() {
    return intList_.size();
  }
  /**
   * <code>repeated int32 intList = 2;</code>
   */
  public int getIntList(int index) {
    return intList_.getInt(index);
  }
  private int intListMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < stringList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stringList_.getRaw(i));
    }
    if (getIntListList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(intListMemoizedSerializedSize);
    }
    for (int i = 0; i < intList_.size(); i++) {
      output.writeInt32NoTag(intList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < stringList_.size(); i++) {
        dataSize += computeStringSizeNoTag(stringList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStringListList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < intList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(intList_.getInt(i));
      }
      size += dataSize;
      if (!getIntListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      intListMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ResponseWithList)) {
      return super.equals(obj);
    }
    ResponseWithList other = (ResponseWithList) obj;

    if (!getStringListList()
        .equals(other.getStringListList())) return false;
    if (!getIntListList()
        .equals(other.getIntListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStringListCount() > 0) {
      hash = (37 * hash) + STRINGLIST_FIELD_NUMBER;
      hash = (53 * hash) + getStringListList().hashCode();
    }
    if (getIntListCount() > 0) {
      hash = (37 * hash) + INTLIST_FIELD_NUMBER;
      hash = (53 * hash) + getIntListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ResponseWithList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResponseWithList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResponseWithList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResponseWithList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResponseWithList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResponseWithList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResponseWithList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResponseWithList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResponseWithList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ResponseWithList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResponseWithList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResponseWithList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ResponseWithList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ResponseWithList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResponseWithList)
      ResponseWithListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Sample.internal_static_ResponseWithList_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Sample.internal_static_ResponseWithList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseWithList.class, Builder.class);
    }

    // Construct using io.siddhi.extension.map.protobuf.autogenerated.ResponseWithList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      stringList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      intList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Sample.internal_static_ResponseWithList_descriptor;
    }

    @Override
    public ResponseWithList getDefaultInstanceForType() {
      return ResponseWithList.getDefaultInstance();
    }

    @Override
    public ResponseWithList build() {
      ResponseWithList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ResponseWithList buildPartial() {
      ResponseWithList result = new ResponseWithList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        stringList_ = stringList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stringList_ = stringList_;
      if (((bitField0_ & 0x00000002) != 0)) {
        intList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.intList_ = intList_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ResponseWithList) {
        return mergeFrom((ResponseWithList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ResponseWithList other) {
      if (other == ResponseWithList.getDefaultInstance()) return this;
      if (!other.stringList_.isEmpty()) {
        if (stringList_.isEmpty()) {
          stringList_ = other.stringList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStringListIsMutable();
          stringList_.addAll(other.stringList_);
        }
        onChanged();
      }
      if (!other.intList_.isEmpty()) {
        if (intList_.isEmpty()) {
          intList_ = other.intList_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureIntListIsMutable();
          intList_.addAll(other.intList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ResponseWithList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ResponseWithList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList stringList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStringListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stringList_ = new com.google.protobuf.LazyStringArrayList(stringList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStringListList() {
      return stringList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public int getStringListCount() {
      return stringList_.size();
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public String getStringList(int index) {
      return stringList_.get(index);
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStringListBytes(int index) {
      return stringList_.getByteString(index);
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public Builder setStringList(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringListIsMutable();
      stringList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public Builder addStringList(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStringListIsMutable();
      stringList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public Builder addAllStringList(
        Iterable<String> values) {
      ensureStringListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stringList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public Builder clearStringList() {
      stringList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string stringList = 1;</code>
     */
    public Builder addStringListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStringListIsMutable();
      stringList_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList intList_ = emptyIntList();
    private void ensureIntListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        intList_ = mutableCopy(intList_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public java.util.List<Integer>
        getIntListList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(intList_) : intList_;
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public int getIntListCount() {
      return intList_.size();
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public int getIntList(int index) {
      return intList_.getInt(index);
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public Builder setIntList(
        int index, int value) {
      ensureIntListIsMutable();
      intList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public Builder addIntList(int value) {
      ensureIntListIsMutable();
      intList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public Builder addAllIntList(
        Iterable<? extends Integer> values) {
      ensureIntListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, intList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 intList = 2;</code>
     */
    public Builder clearIntList() {
      intList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ResponseWithList)
  }

  // @@protoc_insertion_point(class_scope:ResponseWithList)
  private static final ResponseWithList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ResponseWithList();
  }

  public static ResponseWithList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseWithList>
      PARSER = new com.google.protobuf.AbstractParser<ResponseWithList>() {
    @Override
    public ResponseWithList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseWithList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseWithList> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ResponseWithList> getParserForType() {
    return PARSER;
  }

  @Override
  public ResponseWithList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

