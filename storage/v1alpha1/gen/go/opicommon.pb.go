// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2022 Dell Inc, or its subsidiaries.
// {C} Copyright 2022 Pensando Systems Inc. All rights reserved

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: opicommon.proto

package _go

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// AES encryption type to be used
type CryptoType int32

const (
	CryptoType_CRYPTO_TYPE_UNSPECIFIED CryptoType = 0
	CryptoType_CRYPTO_TYPE_AES_CBC_128 CryptoType = 1
	CryptoType_CRYPTO_TYPE_AES_CBC_192 CryptoType = 2
	CryptoType_CRYPTO_TYPE_AES_CBC_256 CryptoType = 3
	CryptoType_CRYPTO_TYPE_AES_XTS_128 CryptoType = 4
	CryptoType_CRYPTO_TYPE_AES_XTS_192 CryptoType = 5
	CryptoType_CRYPTO_TYPE_AES_XTS_256 CryptoType = 6
)

// Enum value maps for CryptoType.
var (
	CryptoType_name = map[int32]string{
		0: "CRYPTO_TYPE_UNSPECIFIED",
		1: "CRYPTO_TYPE_AES_CBC_128",
		2: "CRYPTO_TYPE_AES_CBC_192",
		3: "CRYPTO_TYPE_AES_CBC_256",
		4: "CRYPTO_TYPE_AES_XTS_128",
		5: "CRYPTO_TYPE_AES_XTS_192",
		6: "CRYPTO_TYPE_AES_XTS_256",
	}
	CryptoType_value = map[string]int32{
		"CRYPTO_TYPE_UNSPECIFIED": 0,
		"CRYPTO_TYPE_AES_CBC_128": 1,
		"CRYPTO_TYPE_AES_CBC_192": 2,
		"CRYPTO_TYPE_AES_CBC_256": 3,
		"CRYPTO_TYPE_AES_XTS_128": 4,
		"CRYPTO_TYPE_AES_XTS_192": 5,
		"CRYPTO_TYPE_AES_XTS_256": 6,
	}
)

func (x CryptoType) Enum() *CryptoType {
	p := new(CryptoType)
	*p = x
	return p
}

func (x CryptoType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (CryptoType) Descriptor() protoreflect.EnumDescriptor {
	return file_opicommon_proto_enumTypes[0].Descriptor()
}

func (CryptoType) Type() protoreflect.EnumType {
	return &file_opicommon_proto_enumTypes[0]
}

func (x CryptoType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use CryptoType.Descriptor instead.
func (CryptoType) EnumDescriptor() ([]byte, []int) {
	return file_opicommon_proto_rawDescGZIP(), []int{0}
}

// Many front-ends expose PCI devices to the host. This represents that endpoint.
// This device will ultimately be surfaced by the operating system at some
// Bus:Device:Function, but note that the values set here are not necessarily
// the same values that the operating system will choose. Instead, these are
// xPU-internal values.
// While the term "device" is often used for the entity attached to a PCI slot,
// we'll use the term "port" which also commonly used with PCI switches and avoids
// confusion with storage "devices".
type PciEndpoint struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The "port" or "device". In other words, the connector/cable that's
	// plugged into a particular host. This number may end up matching
	// the host-assigned "device" value in the bus:device:function identifier,
	// but it does not strictly have to and that should not be relied upon.
	PortId int32 `protobuf:"varint,1,opt,name=port_id,json=portId,proto3" json:"port_id,omitempty"`
	// Physical function index. This may end up matching the host-assigned
	// "function" value in the bus:device:function identifier, but it does not
	// strictly have to and that should not be relied upon.
	PhysicalFunction int32 `protobuf:"varint,2,opt,name=physical_function,json=physicalFunction,proto3" json:"physical_function,omitempty"`
	// Virtual function index. This may end up matching the host-assigned
	// "function" value in the bus:device:function identifier, but it does not
	// strictly have to and that should not be relied upon.
	VirtualFunction int32 `protobuf:"varint,3,opt,name=virtual_function,json=virtualFunction,proto3" json:"virtual_function,omitempty"`
}

func (x *PciEndpoint) Reset() {
	*x = PciEndpoint{}
	if protoimpl.UnsafeEnabled {
		mi := &file_opicommon_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PciEndpoint) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PciEndpoint) ProtoMessage() {}

func (x *PciEndpoint) ProtoReflect() protoreflect.Message {
	mi := &file_opicommon_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PciEndpoint.ProtoReflect.Descriptor instead.
func (*PciEndpoint) Descriptor() ([]byte, []int) {
	return file_opicommon_proto_rawDescGZIP(), []int{0}
}

func (x *PciEndpoint) GetPortId() int32 {
	if x != nil {
		return x.PortId
	}
	return 0
}

func (x *PciEndpoint) GetPhysicalFunction() int32 {
	if x != nil {
		return x.PhysicalFunction
	}
	return 0
}

func (x *PciEndpoint) GetVirtualFunction() int32 {
	if x != nil {
		return x.VirtualFunction
	}
	return 0
}

var File_opicommon_proto protoreflect.FileDescriptor

var file_opicommon_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x6f, 0x70, 0x69, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x12, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x22, 0x7e, 0x0a, 0x0b, 0x50, 0x63, 0x69, 0x45, 0x6e, 0x64, 0x70,
	0x6f, 0x69, 0x6e, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x70, 0x6f, 0x72, 0x74, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x70, 0x6f, 0x72, 0x74, 0x49, 0x64, 0x12, 0x2b, 0x0a,
	0x11, 0x70, 0x68, 0x79, 0x73, 0x69, 0x63, 0x61, 0x6c, 0x5f, 0x66, 0x75, 0x6e, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x10, 0x70, 0x68, 0x79, 0x73, 0x69, 0x63,
	0x61, 0x6c, 0x46, 0x75, 0x6e, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x29, 0x0a, 0x10, 0x76, 0x69,
	0x72, 0x74, 0x75, 0x61, 0x6c, 0x5f, 0x66, 0x75, 0x6e, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x05, 0x52, 0x0f, 0x76, 0x69, 0x72, 0x74, 0x75, 0x61, 0x6c, 0x46, 0x75, 0x6e,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2a, 0xd7, 0x01, 0x0a, 0x0a, 0x43, 0x72, 0x79, 0x70, 0x74, 0x6f,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x1b, 0x0a, 0x17, 0x43, 0x52, 0x59, 0x50, 0x54, 0x4f, 0x5f, 0x54,
	0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10,
	0x00, 0x12, 0x1b, 0x0a, 0x17, 0x43, 0x52, 0x59, 0x50, 0x54, 0x4f, 0x5f, 0x54, 0x59, 0x50, 0x45,
	0x5f, 0x41, 0x45, 0x53, 0x5f, 0x43, 0x42, 0x43, 0x5f, 0x31, 0x32, 0x38, 0x10, 0x01, 0x12, 0x1b,
	0x0a, 0x17, 0x43, 0x52, 0x59, 0x50, 0x54, 0x4f, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x41, 0x45,
	0x53, 0x5f, 0x43, 0x42, 0x43, 0x5f, 0x31, 0x39, 0x32, 0x10, 0x02, 0x12, 0x1b, 0x0a, 0x17, 0x43,
	0x52, 0x59, 0x50, 0x54, 0x4f, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x41, 0x45, 0x53, 0x5f, 0x43,
	0x42, 0x43, 0x5f, 0x32, 0x35, 0x36, 0x10, 0x03, 0x12, 0x1b, 0x0a, 0x17, 0x43, 0x52, 0x59, 0x50,
	0x54, 0x4f, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x41, 0x45, 0x53, 0x5f, 0x58, 0x54, 0x53, 0x5f,
	0x31, 0x32, 0x38, 0x10, 0x04, 0x12, 0x1b, 0x0a, 0x17, 0x43, 0x52, 0x59, 0x50, 0x54, 0x4f, 0x5f,
	0x54, 0x59, 0x50, 0x45, 0x5f, 0x41, 0x45, 0x53, 0x5f, 0x58, 0x54, 0x53, 0x5f, 0x31, 0x39, 0x32,
	0x10, 0x05, 0x12, 0x1b, 0x0a, 0x17, 0x43, 0x52, 0x59, 0x50, 0x54, 0x4f, 0x5f, 0x54, 0x59, 0x50,
	0x45, 0x5f, 0x41, 0x45, 0x53, 0x5f, 0x58, 0x54, 0x53, 0x5f, 0x32, 0x35, 0x36, 0x10, 0x06, 0x42,
	0x5d, 0x0a, 0x12, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x42, 0x0e, 0x4f, 0x70, 0x69, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x35, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x69, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x2f, 0x6f,
	0x70, 0x69, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f, 0x76,
	0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_opicommon_proto_rawDescOnce sync.Once
	file_opicommon_proto_rawDescData = file_opicommon_proto_rawDesc
)

func file_opicommon_proto_rawDescGZIP() []byte {
	file_opicommon_proto_rawDescOnce.Do(func() {
		file_opicommon_proto_rawDescData = protoimpl.X.CompressGZIP(file_opicommon_proto_rawDescData)
	})
	return file_opicommon_proto_rawDescData
}

var file_opicommon_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_opicommon_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_opicommon_proto_goTypes = []interface{}{
	(CryptoType)(0),     // 0: opi_api.storage.v1.CryptoType
	(*PciEndpoint)(nil), // 1: opi_api.storage.v1.PciEndpoint
}
var file_opicommon_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_opicommon_proto_init() }
func file_opicommon_proto_init() {
	if File_opicommon_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_opicommon_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PciEndpoint); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_opicommon_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_opicommon_proto_goTypes,
		DependencyIndexes: file_opicommon_proto_depIdxs,
		EnumInfos:         file_opicommon_proto_enumTypes,
		MessageInfos:      file_opicommon_proto_msgTypes,
	}.Build()
	File_opicommon_proto = out.File
	file_opicommon_proto_rawDesc = nil
	file_opicommon_proto_goTypes = nil
	file_opicommon_proto_depIdxs = nil
}
