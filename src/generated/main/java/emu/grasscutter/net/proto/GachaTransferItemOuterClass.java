// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaTransferItem.proto

package emu.grasscutter.net.proto;

public final class GachaTransferItemOuterClass {
  private GachaTransferItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaTransferItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaTransferItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_transfer_item_new = 2;</code>
     * @return The isTransferItemNew.
     */
    boolean getIsTransferItemNew();

    /**
     * <code>.ItemParam item = 15;</code>
     * @return Whether the item field is set.
     */
    boolean hasItem();
    /**
     * <code>.ItemParam item = 15;</code>
     * @return The item.
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItem();
    /**
     * <code>.ItemParam item = 15;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemOrBuilder();
  }
  /**
   * Protobuf type {@code GachaTransferItem}
   */
  public static final class GachaTransferItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaTransferItem)
      GachaTransferItemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaTransferItem.newBuilder() to construct.
    private GachaTransferItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaTransferItem() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaTransferItem();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GachaTransferItem(
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
            case 16: {

              isTransferItemNew_ = input.readBool();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder subBuilder = null;
              if (item_ != null) {
                subBuilder = item_.toBuilder();
              }
              item_ = input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(item_);
                item_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GachaTransferItemOuterClass.internal_static_GachaTransferItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GachaTransferItemOuterClass.internal_static_GachaTransferItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.class, emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.Builder.class);
    }

    public static final int IS_TRANSFER_ITEM_NEW_FIELD_NUMBER = 2;
    private boolean isTransferItemNew_;
    /**
     * <code>bool is_transfer_item_new = 2;</code>
     * @return The isTransferItemNew.
     */
    @java.lang.Override
    public boolean getIsTransferItemNew() {
      return isTransferItemNew_;
    }

    public static final int ITEM_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam item_;
    /**
     * <code>.ItemParam item = 15;</code>
     * @return Whether the item field is set.
     */
    @java.lang.Override
    public boolean hasItem() {
      return item_ != null;
    }
    /**
     * <code>.ItemParam item = 15;</code>
     * @return The item.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItem() {
      return item_ == null ? emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance() : item_;
    }
    /**
     * <code>.ItemParam item = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemOrBuilder() {
      return getItem();
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
      if (isTransferItemNew_ != false) {
        output.writeBool(2, isTransferItemNew_);
      }
      if (item_ != null) {
        output.writeMessage(15, getItem());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTransferItemNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTransferItemNew_);
      }
      if (item_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getItem());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem other = (emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem) obj;

      if (getIsTransferItemNew()
          != other.getIsTransferItemNew()) return false;
      if (hasItem() != other.hasItem()) return false;
      if (hasItem()) {
        if (!getItem()
            .equals(other.getItem())) return false;
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
      hash = (37 * hash) + IS_TRANSFER_ITEM_NEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferItemNew());
      if (hasItem()) {
        hash = (37 * hash) + ITEM_FIELD_NUMBER;
        hash = (53 * hash) + getItem().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem prototype) {
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
     * Protobuf type {@code GachaTransferItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaTransferItem)
        emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GachaTransferItemOuterClass.internal_static_GachaTransferItem_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GachaTransferItemOuterClass.internal_static_GachaTransferItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.class, emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.newBuilder()
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
        isTransferItemNew_ = false;

        if (itemBuilder_ == null) {
          item_ = null;
        } else {
          item_ = null;
          itemBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GachaTransferItemOuterClass.internal_static_GachaTransferItem_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem build() {
        emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem buildPartial() {
        emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem result = new emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem(this);
        result.isTransferItemNew_ = isTransferItemNew_;
        if (itemBuilder_ == null) {
          result.item_ = item_;
        } else {
          result.item_ = itemBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem) {
          return mergeFrom((emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem other) {
        if (other == emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem.getDefaultInstance()) return this;
        if (other.getIsTransferItemNew() != false) {
          setIsTransferItemNew(other.getIsTransferItemNew());
        }
        if (other.hasItem()) {
          mergeItem(other.getItem());
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
        emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isTransferItemNew_ ;
      /**
       * <code>bool is_transfer_item_new = 2;</code>
       * @return The isTransferItemNew.
       */
      @java.lang.Override
      public boolean getIsTransferItemNew() {
        return isTransferItemNew_;
      }
      /**
       * <code>bool is_transfer_item_new = 2;</code>
       * @param value The isTransferItemNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferItemNew(boolean value) {
        
        isTransferItemNew_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_item_new = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferItemNew() {
        
        isTransferItemNew_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam item_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> itemBuilder_;
      /**
       * <code>.ItemParam item = 15;</code>
       * @return Whether the item field is set.
       */
      public boolean hasItem() {
        return itemBuilder_ != null || item_ != null;
      }
      /**
       * <code>.ItemParam item = 15;</code>
       * @return The item.
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItem() {
        if (itemBuilder_ == null) {
          return item_ == null ? emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance() : item_;
        } else {
          return itemBuilder_.getMessage();
        }
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      public Builder setItem(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          item_ = value;
          onChanged();
        } else {
          itemBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      public Builder setItem(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemBuilder_ == null) {
          item_ = builderForValue.build();
          onChanged();
        } else {
          itemBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      public Builder mergeItem(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemBuilder_ == null) {
          if (item_ != null) {
            item_ =
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.newBuilder(item_).mergeFrom(value).buildPartial();
          } else {
            item_ = value;
          }
          onChanged();
        } else {
          itemBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      public Builder clearItem() {
        if (itemBuilder_ == null) {
          item_ = null;
          onChanged();
        } else {
          item_ = null;
          itemBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getItemBuilder() {
        
        onChanged();
        return getItemFieldBuilder().getBuilder();
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemOrBuilder() {
        if (itemBuilder_ != null) {
          return itemBuilder_.getMessageOrBuilder();
        } else {
          return item_ == null ?
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance() : item_;
        }
      }
      /**
       * <code>.ItemParam item = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemFieldBuilder() {
        if (itemBuilder_ == null) {
          itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  getItem(),
                  getParentForChildren(),
                  isClean());
          item_ = null;
        }
        return itemBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GachaTransferItem)
    }

    // @@protoc_insertion_point(class_scope:GachaTransferItem)
    private static final emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem();
    }

    public static emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaTransferItem>
        PARSER = new com.google.protobuf.AbstractParser<GachaTransferItem>() {
      @java.lang.Override
      public GachaTransferItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GachaTransferItem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GachaTransferItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaTransferItem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GachaTransferItemOuterClass.GachaTransferItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaTransferItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaTransferItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GachaTransferItem.proto\032\017ItemParam.pro" +
      "to\"K\n\021GachaTransferItem\022\034\n\024is_transfer_i" +
      "tem_new\030\002 \001(\010\022\030\n\004item\030\017 \001(\0132\n.ItemParamB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_GachaTransferItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaTransferItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaTransferItem_descriptor,
        new java.lang.String[] { "IsTransferItemNew", "Item", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
