// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBulletDeactiveNotify.proto

package emu.grasscutter.net.proto;

public final class EvtBulletDeactiveNotifyOuterClass {
  private EvtBulletDeactiveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBulletDeactiveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBulletDeactiveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector disappear_pos = 1;</code>
     * @return Whether the disappearPos field is set.
     */
    boolean hasDisappearPos();
    /**
     * <code>.Vector disappear_pos = 1;</code>
     * @return The disappearPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getDisappearPos();
    /**
     * <code>.Vector disappear_pos = 1;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getDisappearPosOrBuilder();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * Protobuf type {@code EvtBulletDeactiveNotify}
   */
  public static final class EvtBulletDeactiveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBulletDeactiveNotify)
      EvtBulletDeactiveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBulletDeactiveNotify.newBuilder() to construct.
    private EvtBulletDeactiveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBulletDeactiveNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBulletDeactiveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtBulletDeactiveNotify(
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
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (disappearPos_ != null) {
                subBuilder = disappearPos_.toBuilder();
              }
              disappearPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(disappearPos_);
                disappearPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {

              entityId_ = input.readUInt32();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
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
      return emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.internal_static_EvtBulletDeactiveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.internal_static_EvtBulletDeactiveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.class, emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.Builder.class);
    }

    public static final int DISAPPEAR_POS_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector disappearPos_;
    /**
     * <code>.Vector disappear_pos = 1;</code>
     * @return Whether the disappearPos field is set.
     */
    @java.lang.Override
    public boolean hasDisappearPos() {
      return disappearPos_ != null;
    }
    /**
     * <code>.Vector disappear_pos = 1;</code>
     * @return The disappearPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getDisappearPos() {
      return disappearPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : disappearPos_;
    }
    /**
     * <code>.Vector disappear_pos = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getDisappearPosOrBuilder() {
      return getDisappearPos();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 12;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 12;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      if (disappearPos_ != null) {
        output.writeMessage(1, getDisappearPos());
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(12, forwardType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (disappearPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDisappearPos());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify other = (emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify) obj;

      if (hasDisappearPos() != other.hasDisappearPos()) return false;
      if (hasDisappearPos()) {
        if (!getDisappearPos()
            .equals(other.getDisappearPos())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (forwardType_ != other.forwardType_) return false;
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
      if (hasDisappearPos()) {
        hash = (37 * hash) + DISAPPEAR_POS_FIELD_NUMBER;
        hash = (53 * hash) + getDisappearPos().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify prototype) {
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
     * Protobuf type {@code EvtBulletDeactiveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBulletDeactiveNotify)
        emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.internal_static_EvtBulletDeactiveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.internal_static_EvtBulletDeactiveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.class, emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.newBuilder()
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
        if (disappearPosBuilder_ == null) {
          disappearPos_ = null;
        } else {
          disappearPos_ = null;
          disappearPosBuilder_ = null;
        }
        entityId_ = 0;

        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.internal_static_EvtBulletDeactiveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify build() {
        emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify buildPartial() {
        emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify result = new emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify(this);
        if (disappearPosBuilder_ == null) {
          result.disappearPos_ = disappearPos_;
        } else {
          result.disappearPos_ = disappearPosBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify other) {
        if (other == emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify.getDefaultInstance()) return this;
        if (other.hasDisappearPos()) {
          mergeDisappearPos(other.getDisappearPos());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
        emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector disappearPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> disappearPosBuilder_;
      /**
       * <code>.Vector disappear_pos = 1;</code>
       * @return Whether the disappearPos field is set.
       */
      public boolean hasDisappearPos() {
        return disappearPosBuilder_ != null || disappearPos_ != null;
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       * @return The disappearPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getDisappearPos() {
        if (disappearPosBuilder_ == null) {
          return disappearPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : disappearPos_;
        } else {
          return disappearPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      public Builder setDisappearPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (disappearPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          disappearPos_ = value;
          onChanged();
        } else {
          disappearPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      public Builder setDisappearPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (disappearPosBuilder_ == null) {
          disappearPos_ = builderForValue.build();
          onChanged();
        } else {
          disappearPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      public Builder mergeDisappearPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (disappearPosBuilder_ == null) {
          if (disappearPos_ != null) {
            disappearPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(disappearPos_).mergeFrom(value).buildPartial();
          } else {
            disappearPos_ = value;
          }
          onChanged();
        } else {
          disappearPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      public Builder clearDisappearPos() {
        if (disappearPosBuilder_ == null) {
          disappearPos_ = null;
          onChanged();
        } else {
          disappearPos_ = null;
          disappearPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getDisappearPosBuilder() {
        
        onChanged();
        return getDisappearPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getDisappearPosOrBuilder() {
        if (disappearPosBuilder_ != null) {
          return disappearPosBuilder_.getMessageOrBuilder();
        } else {
          return disappearPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : disappearPos_;
        }
      }
      /**
       * <code>.Vector disappear_pos = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getDisappearPosFieldBuilder() {
        if (disappearPosBuilder_ == null) {
          disappearPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getDisappearPos(),
                  getParentForChildren(),
                  isClean());
          disappearPos_ = null;
        }
        return disappearPosBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtBulletDeactiveNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBulletDeactiveNotify)
    private static final emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify();
    }

    public static emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBulletDeactiveNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBulletDeactiveNotify>() {
      @java.lang.Override
      public EvtBulletDeactiveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtBulletDeactiveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtBulletDeactiveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBulletDeactiveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBulletDeactiveNotifyOuterClass.EvtBulletDeactiveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBulletDeactiveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBulletDeactiveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035EvtBulletDeactiveNotify.proto\032\014Vector." +
      "proto\032\021ForwardType.proto\"p\n\027EvtBulletDea" +
      "ctiveNotify\022\036\n\rdisappear_pos\030\001 \001(\0132\007.Vec" +
      "tor\022\021\n\tentity_id\030\013 \001(\r\022\"\n\014forward_type\030\014" +
      " \001(\0162\014.ForwardTypeB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtBulletDeactiveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBulletDeactiveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBulletDeactiveNotify_descriptor,
        new java.lang.String[] { "DisappearPos", "EntityId", "ForwardType", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
