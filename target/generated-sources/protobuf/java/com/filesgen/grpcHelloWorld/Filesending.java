// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: filesending.proto

package com.filesgen.grpcHelloWorld;

public final class Filesending {
  private Filesending() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_MESSAGE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_MESSAGE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_METADATA_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_METADATA_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_JOURNEY_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_JOURNEY_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_DISPATCHDETAILS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_DISPATCHDETAILS_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_SELF_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_SELF_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_FileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_FileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021filesending.proto\022\033com.filesgen.grpcHe" +
      "lloWorld\"\271\010\n\013FileRequest\022\n\n\002id\030\001 \001(\t\022A\n\007" +
      "message\030\002 \001(\01320.com.filesgen.grpcHelloWo" +
      "rld.FileRequest.MESSAGE\022?\n\006source\030\003 \001(\0132" +
      "/.com.filesgen.grpcHelloWorld.FileReques" +
      "t.SOURCE\022A\n\007sources\030\004 \003(\01320.com.filesgen" +
      ".grpcHelloWorld.FileRequest.SOURCES\022\025\n\re" +
      "xecutionType\030\005 \001(\t\022\016\n\006status\030\006 \001(\t\022Q\n\017di" +
      "spatchDetails\030\007 \003(\01328.com.filesgen.grpcH" +
      "elloWorld.FileRequest.DISPATCHDETAILS\022\034\n" +
      "\024terminalEventDetails\030\010 \003(\t\022\021\n\tcreatedAt" +
      "\030\t \001(\t\022\022\n\nmodifiedAt\030\n \001(\t\022\021\n\tcreatedBy\030" +
      "\013 \001(\t\022\022\n\nmodifiedBy\030\014 \001(\t\022?\n\006_links\030\r \001(" +
      "\0132/.com.filesgen.grpcHelloWorld.FileRequ" +
      "est._LINKS\032>\n\007MESSAGE\022\n\n\002id\030\001 \001(\t\022\025\n\rpub" +
      "licationId\030\002 \001(\t\022\020\n\010channels\030\003 \003(\t\032\374\001\n\006S" +
      "OURCE\022\n\n\002id\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022J\n\010metad" +
      "ata\030\003 \001(\01328.com.filesgen.grpcHelloWorld." +
      "FileRequest.SOURCE.METADATA\032\213\001\n\010METADATA" +
      "\022\021\n\tjourneyId\030\001 \001(\t\022\027\n\017journeyActionId\030\002" +
      " \001(\t\022\036\n\026journeyBatchInstanceId\030\003 \001(\t\022\030\n\020" +
      "journeyVersionId\030\004 \001(\t\022\031\n\021journeyInstanc" +
      "eId\030\005 \001(\t\032k\n\007SOURCES\022I\n\007journey\030\001 \001(\01328." +
      "com.filesgen.grpcHelloWorld.FileRequest." +
      "SOURCES.JOURNEY\032\025\n\007JOURNEY\022\n\n\002id\030\001 \001(\t\032 " +
      "\n\017DISPATCHDETAILS\022\r\n\005value\030\001 \001(\t\032b\n\006_LIN" +
      "KS\022B\n\004self\030\001 \001(\01324.com.filesgen.grpcHell" +
      "oWorld.FileRequest._LINKS.SELF\032\024\n\004SELF\022\014" +
      "\n\004href\030\001 \001(\t\"\035\n\014FileResponse\022\r\n\005reply\030\001 " +
      "\001(\t2s\n\013FileService\022d\n\013filegetting\022(.com." +
      "filesgen.grpcHelloWorld.FileRequest\032).co" +
      "m.filesgen.grpcHelloWorld.FileResponse\"\000" +
      "B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor,
        new java.lang.String[] { "Id", "Message", "Source", "Sources", "ExecutionType", "Status", "DispatchDetails", "TerminalEventDetails", "CreatedAt", "ModifiedAt", "CreatedBy", "ModifiedBy", "Links", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_MESSAGE_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor.getNestedTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_MESSAGE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_MESSAGE_descriptor,
        new java.lang.String[] { "Id", "PublicationId", "Channels", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor.getNestedTypes().get(1);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_descriptor,
        new java.lang.String[] { "Id", "Type", "Metadata", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_METADATA_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_descriptor.getNestedTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_METADATA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCE_METADATA_descriptor,
        new java.lang.String[] { "JourneyId", "JourneyActionId", "JourneyBatchInstanceId", "JourneyVersionId", "JourneyInstanceId", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor.getNestedTypes().get(2);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_descriptor,
        new java.lang.String[] { "Journey", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_JOURNEY_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_descriptor.getNestedTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_JOURNEY_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_SOURCES_JOURNEY_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_DISPATCHDETAILS_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor.getNestedTypes().get(3);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest_DISPATCHDETAILS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest_DISPATCHDETAILS_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest_descriptor.getNestedTypes().get(4);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_descriptor,
        new java.lang.String[] { "Self", });
    internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_SELF_descriptor =
      internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_descriptor.getNestedTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_SELF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileRequest__LINKS_SELF_descriptor,
        new java.lang.String[] { "Href", });
    internal_static_com_filesgen_grpcHelloWorld_FileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_filesgen_grpcHelloWorld_FileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_FileResponse_descriptor,
        new java.lang.String[] { "Reply", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
