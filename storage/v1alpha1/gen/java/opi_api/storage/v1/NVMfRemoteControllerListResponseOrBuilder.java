// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface NVMfRemoteControllerListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMfRemoteControllerListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NVMfRemoteController> 
      getCtrlList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   */
  opi_api.storage.v1.NVMfRemoteController getCtrl(int index);
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   */
  int getCtrlCount();
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NVMfRemoteControllerOrBuilder> 
      getCtrlOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   */
  opi_api.storage.v1.NVMfRemoteControllerOrBuilder getCtrlOrBuilder(
      int index);
}
