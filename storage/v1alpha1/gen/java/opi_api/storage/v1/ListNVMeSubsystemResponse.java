// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListNVMeSubsystemResponse}
 */
public final class ListNVMeSubsystemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNVMeSubsystemResponse)
    ListNVMeSubsystemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNVMeSubsystemResponse.newBuilder() to construct.
  private ListNVMeSubsystemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNVMeSubsystemResponse() {
    subsystems_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNVMeSubsystemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNVMeSubsystemResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              subsystems_ = new java.util.ArrayList<opi_api.storage.v1.NVMeSubsystem>();
              mutable_bitField0_ |= 0x00000001;
            }
            subsystems_.add(
                input.readMessage(opi_api.storage.v1.NVMeSubsystem.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        subsystems_ = java.util.Collections.unmodifiableList(subsystems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeSubsystemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeSubsystemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNVMeSubsystemResponse.class, opi_api.storage.v1.ListNVMeSubsystemResponse.Builder.class);
  }

  public static final int SUBSYSTEMS_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NVMeSubsystem> subsystems_;
  /**
   * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NVMeSubsystem> getSubsystemsList() {
    return subsystems_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NVMeSubsystemOrBuilder> 
      getSubsystemsOrBuilderList() {
    return subsystems_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
   */
  @java.lang.Override
  public int getSubsystemsCount() {
    return subsystems_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeSubsystem getSubsystems(int index) {
    return subsystems_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeSubsystemOrBuilder getSubsystemsOrBuilder(
      int index) {
    return subsystems_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < subsystems_.size(); i++) {
      output.writeMessage(1, subsystems_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subsystems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subsystems_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.ListNVMeSubsystemResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNVMeSubsystemResponse other = (opi_api.storage.v1.ListNVMeSubsystemResponse) obj;

    if (!getSubsystemsList()
        .equals(other.getSubsystemsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSubsystemsCount() > 0) {
      hash = (37 * hash) + SUBSYSTEMS_FIELD_NUMBER;
      hash = (53 * hash) + getSubsystemsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMeSubsystemResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.ListNVMeSubsystemResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.ListNVMeSubsystemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNVMeSubsystemResponse)
      opi_api.storage.v1.ListNVMeSubsystemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeSubsystemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeSubsystemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNVMeSubsystemResponse.class, opi_api.storage.v1.ListNVMeSubsystemResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNVMeSubsystemResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSubsystemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (subsystemsBuilder_ == null) {
        subsystems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        subsystemsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeSubsystemResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMeSubsystemResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNVMeSubsystemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMeSubsystemResponse build() {
      opi_api.storage.v1.ListNVMeSubsystemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMeSubsystemResponse buildPartial() {
      opi_api.storage.v1.ListNVMeSubsystemResponse result = new opi_api.storage.v1.ListNVMeSubsystemResponse(this);
      int from_bitField0_ = bitField0_;
      if (subsystemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subsystems_ = java.util.Collections.unmodifiableList(subsystems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subsystems_ = subsystems_;
      } else {
        result.subsystems_ = subsystemsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.ListNVMeSubsystemResponse) {
        return mergeFrom((opi_api.storage.v1.ListNVMeSubsystemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNVMeSubsystemResponse other) {
      if (other == opi_api.storage.v1.ListNVMeSubsystemResponse.getDefaultInstance()) return this;
      if (subsystemsBuilder_ == null) {
        if (!other.subsystems_.isEmpty()) {
          if (subsystems_.isEmpty()) {
            subsystems_ = other.subsystems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubsystemsIsMutable();
            subsystems_.addAll(other.subsystems_);
          }
          onChanged();
        }
      } else {
        if (!other.subsystems_.isEmpty()) {
          if (subsystemsBuilder_.isEmpty()) {
            subsystemsBuilder_.dispose();
            subsystemsBuilder_ = null;
            subsystems_ = other.subsystems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subsystemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubsystemsFieldBuilder() : null;
          } else {
            subsystemsBuilder_.addAllMessages(other.subsystems_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.ListNVMeSubsystemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNVMeSubsystemResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NVMeSubsystem> subsystems_ =
      java.util.Collections.emptyList();
    private void ensureSubsystemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subsystems_ = new java.util.ArrayList<opi_api.storage.v1.NVMeSubsystem>(subsystems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder> subsystemsBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMeSubsystem> getSubsystemsList() {
      if (subsystemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subsystems_);
      } else {
        return subsystemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public int getSubsystemsCount() {
      if (subsystemsBuilder_ == null) {
        return subsystems_.size();
      } else {
        return subsystemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystem getSubsystems(int index) {
      if (subsystemsBuilder_ == null) {
        return subsystems_.get(index);
      } else {
        return subsystemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder setSubsystems(
        int index, opi_api.storage.v1.NVMeSubsystem value) {
      if (subsystemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubsystemsIsMutable();
        subsystems_.set(index, value);
        onChanged();
      } else {
        subsystemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder setSubsystems(
        int index, opi_api.storage.v1.NVMeSubsystem.Builder builderForValue) {
      if (subsystemsBuilder_ == null) {
        ensureSubsystemsIsMutable();
        subsystems_.set(index, builderForValue.build());
        onChanged();
      } else {
        subsystemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder addSubsystems(opi_api.storage.v1.NVMeSubsystem value) {
      if (subsystemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubsystemsIsMutable();
        subsystems_.add(value);
        onChanged();
      } else {
        subsystemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder addSubsystems(
        int index, opi_api.storage.v1.NVMeSubsystem value) {
      if (subsystemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubsystemsIsMutable();
        subsystems_.add(index, value);
        onChanged();
      } else {
        subsystemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder addSubsystems(
        opi_api.storage.v1.NVMeSubsystem.Builder builderForValue) {
      if (subsystemsBuilder_ == null) {
        ensureSubsystemsIsMutable();
        subsystems_.add(builderForValue.build());
        onChanged();
      } else {
        subsystemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder addSubsystems(
        int index, opi_api.storage.v1.NVMeSubsystem.Builder builderForValue) {
      if (subsystemsBuilder_ == null) {
        ensureSubsystemsIsMutable();
        subsystems_.add(index, builderForValue.build());
        onChanged();
      } else {
        subsystemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder addAllSubsystems(
        java.lang.Iterable<? extends opi_api.storage.v1.NVMeSubsystem> values) {
      if (subsystemsBuilder_ == null) {
        ensureSubsystemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subsystems_);
        onChanged();
      } else {
        subsystemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder clearSubsystems() {
      if (subsystemsBuilder_ == null) {
        subsystems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subsystemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public Builder removeSubsystems(int index) {
      if (subsystemsBuilder_ == null) {
        ensureSubsystemsIsMutable();
        subsystems_.remove(index);
        onChanged();
      } else {
        subsystemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystem.Builder getSubsystemsBuilder(
        int index) {
      return getSubsystemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystemOrBuilder getSubsystemsOrBuilder(
        int index) {
      if (subsystemsBuilder_ == null) {
        return subsystems_.get(index);  } else {
        return subsystemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NVMeSubsystemOrBuilder> 
         getSubsystemsOrBuilderList() {
      if (subsystemsBuilder_ != null) {
        return subsystemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subsystems_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystem.Builder addSubsystemsBuilder() {
      return getSubsystemsFieldBuilder().addBuilder(
          opi_api.storage.v1.NVMeSubsystem.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystem.Builder addSubsystemsBuilder(
        int index) {
      return getSubsystemsFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NVMeSubsystem.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeSubsystem subsystems = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMeSubsystem.Builder> 
         getSubsystemsBuilderList() {
      return getSubsystemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder> 
        getSubsystemsFieldBuilder() {
      if (subsystemsBuilder_ == null) {
        subsystemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder>(
                subsystems_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subsystems_ = null;
      }
      return subsystemsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNVMeSubsystemResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeSubsystemResponse)
  private static final opi_api.storage.v1.ListNVMeSubsystemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNVMeSubsystemResponse();
  }

  public static opi_api.storage.v1.ListNVMeSubsystemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNVMeSubsystemResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNVMeSubsystemResponse>() {
    @java.lang.Override
    public ListNVMeSubsystemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNVMeSubsystemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNVMeSubsystemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNVMeSubsystemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNVMeSubsystemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

