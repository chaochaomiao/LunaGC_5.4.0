// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreakoutElementReactionCounter.proto

package emu.grasscutter.net.proto;

public final class BreakoutElementReactionCounterOuterClass {
  private BreakoutElementReactionCounterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutElementReactionCounterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutElementReactionCounter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 2;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>uint32 PHOHIGFDOCI = 1;</code>
     * @return The pHOHIGFDOCI.
     */
    int getPHOHIGFDOCI();
  }
  /**
   * Protobuf type {@code BreakoutElementReactionCounter}
   */
  public static final class BreakoutElementReactionCounter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BreakoutElementReactionCounter)
      BreakoutElementReactionCounterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BreakoutElementReactionCounter.newBuilder() to construct.
    private BreakoutElementReactionCounter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BreakoutElementReactionCounter() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BreakoutElementReactionCounter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BreakoutElementReactionCounter(
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
            case 8: {

              pHOHIGFDOCI_ = input.readUInt32();
              break;
            }
            case 16: {

              count_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.class, emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>uint32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int PHOHIGFDOCI_FIELD_NUMBER = 1;
    private int pHOHIGFDOCI_;
    /**
     * <code>uint32 PHOHIGFDOCI = 1;</code>
     * @return The pHOHIGFDOCI.
     */
    @java.lang.Override
    public int getPHOHIGFDOCI() {
      return pHOHIGFDOCI_;
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
      if (pHOHIGFDOCI_ != 0) {
        output.writeUInt32(1, pHOHIGFDOCI_);
      }
      if (count_ != 0) {
        output.writeUInt32(2, count_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pHOHIGFDOCI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pHOHIGFDOCI_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, count_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter other = (emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter) obj;

      if (getCount()
          != other.getCount()) return false;
      if (getPHOHIGFDOCI()
          != other.getPHOHIGFDOCI()) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + PHOHIGFDOCI_FIELD_NUMBER;
      hash = (53 * hash) + getPHOHIGFDOCI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter prototype) {
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
     * Protobuf type {@code BreakoutElementReactionCounter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutElementReactionCounter)
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.class, emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.newBuilder()
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
        count_ = 0;

        pHOHIGFDOCI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter build() {
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter buildPartial() {
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter result = new emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter(this);
        result.count_ = count_;
        result.pHOHIGFDOCI_ = pHOHIGFDOCI_;
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
        if (other instanceof emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter) {
          return mergeFrom((emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter other) {
        if (other == emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getPHOHIGFDOCI() != 0) {
          setPHOHIGFDOCI(other.getPHOHIGFDOCI());
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
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 2;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 2;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private int pHOHIGFDOCI_ ;
      /**
       * <code>uint32 PHOHIGFDOCI = 1;</code>
       * @return The pHOHIGFDOCI.
       */
      @java.lang.Override
      public int getPHOHIGFDOCI() {
        return pHOHIGFDOCI_;
      }
      /**
       * <code>uint32 PHOHIGFDOCI = 1;</code>
       * @param value The pHOHIGFDOCI to set.
       * @return This builder for chaining.
       */
      public Builder setPHOHIGFDOCI(int value) {
        
        pHOHIGFDOCI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PHOHIGFDOCI = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPHOHIGFDOCI() {
        
        pHOHIGFDOCI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BreakoutElementReactionCounter)
    }

    // @@protoc_insertion_point(class_scope:BreakoutElementReactionCounter)
    private static final emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter();
    }

    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutElementReactionCounter>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutElementReactionCounter>() {
      @java.lang.Override
      public BreakoutElementReactionCounter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BreakoutElementReactionCounter(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BreakoutElementReactionCounter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BreakoutElementReactionCounter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutElementReactionCounter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BreakoutElementReactionCounter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$BreakoutElementReactionCounter.proto\"D" +
      "\n\036BreakoutElementReactionCounter\022\r\n\005coun" +
      "t\030\002 \001(\r\022\023\n\013PHOHIGFDOCI\030\001 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BreakoutElementReactionCounter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutElementReactionCounter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BreakoutElementReactionCounter_descriptor,
        new java.lang.String[] { "Count", "PHOHIGFDOCI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
