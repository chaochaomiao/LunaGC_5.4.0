// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnfreezeGroupLimitNotify.proto

package emu.grasscutter.net.proto;

public final class UnfreezeGroupLimitNotifyOuterClass {
  private UnfreezeGroupLimitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnfreezeGroupLimitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnfreezeGroupLimitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 5;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 scene_id = 14;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * Protobuf type {@code UnfreezeGroupLimitNotify}
   */
  public static final class UnfreezeGroupLimitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnfreezeGroupLimitNotify)
      UnfreezeGroupLimitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnfreezeGroupLimitNotify.newBuilder() to construct.
    private UnfreezeGroupLimitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnfreezeGroupLimitNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnfreezeGroupLimitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnfreezeGroupLimitNotify(
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
            case 40: {

              pointId_ = input.readUInt32();
              break;
            }
            case 112: {

              sceneId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.class, emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 5;
    private int pointId_;
    /**
     * <code>uint32 point_id = 5;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 14;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 14;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (pointId_ != 0) {
        output.writeUInt32(5, pointId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(14, sceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, pointId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify other = (emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify prototype) {
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
     * Protobuf type {@code UnfreezeGroupLimitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnfreezeGroupLimitNotify)
        emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.class, emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.newBuilder()
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
        pointId_ = 0;

        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify build() {
        emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify buildPartial() {
        emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify result = new emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify(this);
        result.pointId_ = pointId_;
        result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify) {
          return mergeFrom((emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify other) {
        if (other == emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 5;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 5;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 14;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 14;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UnfreezeGroupLimitNotify)
    }

    // @@protoc_insertion_point(class_scope:UnfreezeGroupLimitNotify)
    private static final emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify();
    }

    public static emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnfreezeGroupLimitNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnfreezeGroupLimitNotify>() {
      @java.lang.Override
      public UnfreezeGroupLimitNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnfreezeGroupLimitNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnfreezeGroupLimitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnfreezeGroupLimitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnfreezeGroupLimitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036UnfreezeGroupLimitNotify.proto\">\n\030Unfr" +
      "eezeGroupLimitNotify\022\020\n\010point_id\030\005 \001(\r\022\020" +
      "\n\010scene_id\030\016 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnfreezeGroupLimitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnfreezeGroupLimitNotify_descriptor,
        new java.lang.String[] { "PointId", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
