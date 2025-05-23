// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostEnterSceneReq.proto

package emu.grasscutter.net.proto;

public final class PostEnterSceneReqOuterClass {
  private PostEnterSceneReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PostEnterSceneReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PostEnterSceneReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 enter_scene_token = 3;</code>
     * @return The enterSceneToken.
     */
    int getEnterSceneToken();

    /**
     * <code>double total_tick_time = 5;</code>
     * @return The totalTickTime.
     */
    double getTotalTickTime();
  }
  /**
   * Protobuf type {@code PostEnterSceneReq}
   */
  public static final class PostEnterSceneReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PostEnterSceneReq)
      PostEnterSceneReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PostEnterSceneReq.newBuilder() to construct.
    private PostEnterSceneReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PostEnterSceneReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PostEnterSceneReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PostEnterSceneReq(
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
            case 24: {

              enterSceneToken_ = input.readUInt32();
              break;
            }
            case 41: {

              totalTickTime_ = input.readDouble();
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
      return emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.class, emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.Builder.class);
    }

    public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 3;
    private int enterSceneToken_;
    /**
     * <code>uint32 enter_scene_token = 3;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
    }

    public static final int TOTAL_TICK_TIME_FIELD_NUMBER = 5;
    private double totalTickTime_;
    /**
     * <code>double total_tick_time = 5;</code>
     * @return The totalTickTime.
     */
    @java.lang.Override
    public double getTotalTickTime() {
      return totalTickTime_;
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
      if (enterSceneToken_ != 0) {
        output.writeUInt32(3, enterSceneToken_);
      }
      if (totalTickTime_ != 0D) {
        output.writeDouble(5, totalTickTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (enterSceneToken_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, enterSceneToken_);
      }
      if (totalTickTime_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, totalTickTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq other = (emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq) obj;

      if (getEnterSceneToken()
          != other.getEnterSceneToken()) return false;
      if (java.lang.Double.doubleToLongBits(getTotalTickTime())
          != java.lang.Double.doubleToLongBits(
              other.getTotalTickTime())) return false;
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
      hash = (37 * hash) + ENTER_SCENE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getEnterSceneToken();
      hash = (37 * hash) + TOTAL_TICK_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getTotalTickTime()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq prototype) {
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
     * Protobuf type {@code PostEnterSceneReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PostEnterSceneReq)
        emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.class, emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.newBuilder()
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
        enterSceneToken_ = 0;

        totalTickTime_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.internal_static_PostEnterSceneReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq build() {
        emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq buildPartial() {
        emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq result = new emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq(this);
        result.enterSceneToken_ = enterSceneToken_;
        result.totalTickTime_ = totalTickTime_;
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
        if (other instanceof emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq) {
          return mergeFrom((emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq other) {
        if (other == emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq.getDefaultInstance()) return this;
        if (other.getEnterSceneToken() != 0) {
          setEnterSceneToken(other.getEnterSceneToken());
        }
        if (other.getTotalTickTime() != 0D) {
          setTotalTickTime(other.getTotalTickTime());
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
        emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterSceneToken_ ;
      /**
       * <code>uint32 enter_scene_token = 3;</code>
       * @return The enterSceneToken.
       */
      @java.lang.Override
      public int getEnterSceneToken() {
        return enterSceneToken_;
      }
      /**
       * <code>uint32 enter_scene_token = 3;</code>
       * @param value The enterSceneToken to set.
       * @return This builder for chaining.
       */
      public Builder setEnterSceneToken(int value) {
        
        enterSceneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_scene_token = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterSceneToken() {
        
        enterSceneToken_ = 0;
        onChanged();
        return this;
      }

      private double totalTickTime_ ;
      /**
       * <code>double total_tick_time = 5;</code>
       * @return The totalTickTime.
       */
      @java.lang.Override
      public double getTotalTickTime() {
        return totalTickTime_;
      }
      /**
       * <code>double total_tick_time = 5;</code>
       * @param value The totalTickTime to set.
       * @return This builder for chaining.
       */
      public Builder setTotalTickTime(double value) {
        
        totalTickTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double total_tick_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalTickTime() {
        
        totalTickTime_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:PostEnterSceneReq)
    }

    // @@protoc_insertion_point(class_scope:PostEnterSceneReq)
    private static final emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq();
    }

    public static emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PostEnterSceneReq>
        PARSER = new com.google.protobuf.AbstractParser<PostEnterSceneReq>() {
      @java.lang.Override
      public PostEnterSceneReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PostEnterSceneReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PostEnterSceneReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PostEnterSceneReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PostEnterSceneReqOuterClass.PostEnterSceneReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostEnterSceneReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostEnterSceneReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PostEnterSceneReq.proto\"G\n\021PostEnterSc" +
      "eneReq\022\031\n\021enter_scene_token\030\003 \001(\r\022\027\n\017tot" +
      "al_tick_time\030\005 \001(\001B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PostEnterSceneReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PostEnterSceneReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostEnterSceneReq_descriptor,
        new java.lang.String[] { "EnterSceneToken", "TotalTickTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
