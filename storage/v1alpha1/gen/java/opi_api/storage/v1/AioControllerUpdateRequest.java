// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.AioControllerUpdateRequest}
 */
public final class AioControllerUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.AioControllerUpdateRequest)
    AioControllerUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AioControllerUpdateRequest.newBuilder() to construct.
  private AioControllerUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AioControllerUpdateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AioControllerUpdateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AioControllerUpdateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            opi_api.storage.v1.AioController.Builder subBuilder = null;
            if (device_ != null) {
              subBuilder = device_.toBuilder();
            }
            device_ = input.readMessage(opi_api.storage.v1.AioController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(device_);
              device_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.AioControllerUpdateRequest.class, opi_api.storage.v1.AioControllerUpdateRequest.Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 1;
  private opi_api.storage.v1.AioController device_;
  /**
   * <code>.opi_api.storage.v1.AioController device = 1;</code>
   * @return Whether the device field is set.
   */
  @java.lang.Override
  public boolean hasDevice() {
    return device_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.AioController device = 1;</code>
   * @return The device.
   */
  @java.lang.Override
  public opi_api.storage.v1.AioController getDevice() {
    return device_ == null ? opi_api.storage.v1.AioController.getDefaultInstance() : device_;
  }
  /**
   * <code>.opi_api.storage.v1.AioController device = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioControllerOrBuilder getDeviceOrBuilder() {
    return getDevice();
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
    if (device_ != null) {
      output.writeMessage(1, getDevice());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (device_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDevice());
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
    if (!(obj instanceof opi_api.storage.v1.AioControllerUpdateRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.AioControllerUpdateRequest other = (opi_api.storage.v1.AioControllerUpdateRequest) obj;

    if (hasDevice() != other.hasDevice()) return false;
    if (hasDevice()) {
      if (!getDevice()
          .equals(other.getDevice())) return false;
    }
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
    if (hasDevice()) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDevice().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerUpdateRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.AioControllerUpdateRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.AioControllerUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.AioControllerUpdateRequest)
      opi_api.storage.v1.AioControllerUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.AioControllerUpdateRequest.class, opi_api.storage.v1.AioControllerUpdateRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.AioControllerUpdateRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deviceBuilder_ == null) {
        device_ = null;
      } else {
        device_ = null;
        deviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerUpdateRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerUpdateRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.AioControllerUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerUpdateRequest build() {
      opi_api.storage.v1.AioControllerUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerUpdateRequest buildPartial() {
      opi_api.storage.v1.AioControllerUpdateRequest result = new opi_api.storage.v1.AioControllerUpdateRequest(this);
      if (deviceBuilder_ == null) {
        result.device_ = device_;
      } else {
        result.device_ = deviceBuilder_.build();
      }
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
      if (other instanceof opi_api.storage.v1.AioControllerUpdateRequest) {
        return mergeFrom((opi_api.storage.v1.AioControllerUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.AioControllerUpdateRequest other) {
      if (other == opi_api.storage.v1.AioControllerUpdateRequest.getDefaultInstance()) return this;
      if (other.hasDevice()) {
        mergeDevice(other.getDevice());
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
      opi_api.storage.v1.AioControllerUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.AioControllerUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.AioController device_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder> deviceBuilder_;
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     * @return Whether the device field is set.
     */
    public boolean hasDevice() {
      return deviceBuilder_ != null || device_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     * @return The device.
     */
    public opi_api.storage.v1.AioController getDevice() {
      if (deviceBuilder_ == null) {
        return device_ == null ? opi_api.storage.v1.AioController.getDefaultInstance() : device_;
      } else {
        return deviceBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder setDevice(opi_api.storage.v1.AioController value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        device_ = value;
        onChanged();
      } else {
        deviceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder setDevice(
        opi_api.storage.v1.AioController.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        device_ = builderForValue.build();
        onChanged();
      } else {
        deviceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder mergeDevice(opi_api.storage.v1.AioController value) {
      if (deviceBuilder_ == null) {
        if (device_ != null) {
          device_ =
            opi_api.storage.v1.AioController.newBuilder(device_).mergeFrom(value).buildPartial();
        } else {
          device_ = value;
        }
        onChanged();
      } else {
        deviceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder clearDevice() {
      if (deviceBuilder_ == null) {
        device_ = null;
        onChanged();
      } else {
        device_ = null;
        deviceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder getDeviceBuilder() {
      
      onChanged();
      return getDeviceFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioControllerOrBuilder getDeviceOrBuilder() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilder();
      } else {
        return device_ == null ?
            opi_api.storage.v1.AioController.getDefaultInstance() : device_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.AioController device = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder> 
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder>(
                getDevice(),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.AioControllerUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioControllerUpdateRequest)
  private static final opi_api.storage.v1.AioControllerUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.AioControllerUpdateRequest();
  }

  public static opi_api.storage.v1.AioControllerUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AioControllerUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<AioControllerUpdateRequest>() {
    @java.lang.Override
    public AioControllerUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AioControllerUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AioControllerUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AioControllerUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.AioControllerUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

