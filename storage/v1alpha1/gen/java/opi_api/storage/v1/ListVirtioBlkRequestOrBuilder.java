// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public interface ListVirtioBlkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListVirtioBlkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 page_size = 1;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
