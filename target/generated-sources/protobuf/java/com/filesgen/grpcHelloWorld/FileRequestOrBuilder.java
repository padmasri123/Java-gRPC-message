// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: filesending.proto

package com.filesgen.grpcHelloWorld;

public interface FileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.filesgen.grpcHelloWorld.FileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest.MESSAGE message = 2;</code>
   */
  boolean hasMessage();
  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest.MESSAGE message = 2;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.MESSAGE getMessage();
  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest.MESSAGE message = 2;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.MESSAGEOrBuilder getMessageOrBuilder();

  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest.SOURCE source = 3;</code>
   */
  boolean hasSource();
  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest.SOURCE source = 3;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.SOURCE getSource();
  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest.SOURCE source = 3;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.SOURCEOrBuilder getSourceOrBuilder();

  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.SOURCES sources = 4;</code>
   */
  java.util.List<com.filesgen.grpcHelloWorld.FileRequest.SOURCES> 
      getSourcesList();
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.SOURCES sources = 4;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.SOURCES getSources(int index);
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.SOURCES sources = 4;</code>
   */
  int getSourcesCount();
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.SOURCES sources = 4;</code>
   */
  java.util.List<? extends com.filesgen.grpcHelloWorld.FileRequest.SOURCESOrBuilder> 
      getSourcesOrBuilderList();
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.SOURCES sources = 4;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.SOURCESOrBuilder getSourcesOrBuilder(
      int index);

  /**
   * <code>string executionType = 5;</code>
   */
  java.lang.String getExecutionType();
  /**
   * <code>string executionType = 5;</code>
   */
  com.google.protobuf.ByteString
      getExecutionTypeBytes();

  /**
   * <code>string status = 6;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 6;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS dispatchDetails = 7;</code>
   */
  java.util.List<com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS> 
      getDispatchDetailsList();
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS dispatchDetails = 7;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS getDispatchDetails(int index);
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS dispatchDetails = 7;</code>
   */
  int getDispatchDetailsCount();
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS dispatchDetails = 7;</code>
   */
  java.util.List<? extends com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILSOrBuilder> 
      getDispatchDetailsOrBuilderList();
  /**
   * <code>repeated .com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILS dispatchDetails = 7;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest.DISPATCHDETAILSOrBuilder getDispatchDetailsOrBuilder(
      int index);

  /**
   * <code>repeated string terminalEventDetails = 8;</code>
   */
  java.util.List<java.lang.String>
      getTerminalEventDetailsList();
  /**
   * <code>repeated string terminalEventDetails = 8;</code>
   */
  int getTerminalEventDetailsCount();
  /**
   * <code>repeated string terminalEventDetails = 8;</code>
   */
  java.lang.String getTerminalEventDetails(int index);
  /**
   * <code>repeated string terminalEventDetails = 8;</code>
   */
  com.google.protobuf.ByteString
      getTerminalEventDetailsBytes(int index);

  /**
   * <code>string createdAt = 9;</code>
   */
  java.lang.String getCreatedAt();
  /**
   * <code>string createdAt = 9;</code>
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <code>string modifiedAt = 10;</code>
   */
  java.lang.String getModifiedAt();
  /**
   * <code>string modifiedAt = 10;</code>
   */
  com.google.protobuf.ByteString
      getModifiedAtBytes();

  /**
   * <code>string createdBy = 11;</code>
   */
  java.lang.String getCreatedBy();
  /**
   * <code>string createdBy = 11;</code>
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <code>string modifiedBy = 12;</code>
   */
  java.lang.String getModifiedBy();
  /**
   * <code>string modifiedBy = 12;</code>
   */
  com.google.protobuf.ByteString
      getModifiedByBytes();

  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest._LINKS _links = 13;</code>
   */
  boolean hasLinks();
  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest._LINKS _links = 13;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest._LINKS getLinks();
  /**
   * <code>.com.filesgen.grpcHelloWorld.FileRequest._LINKS _links = 13;</code>
   */
  com.filesgen.grpcHelloWorld.FileRequest._LINKSOrBuilder getLinksOrBuilder();
}
