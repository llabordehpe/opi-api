# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import frontend_nvme_pcie_pb2 as frontend__nvme__pcie__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class FrontendNvmeServiceStub(object):
    """Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateNVMeSubsystem = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/CreateNVMeSubsystem',
                request_serializer=frontend__nvme__pcie__pb2.CreateNVMeSubsystemRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeSubsystem.FromString,
                )
        self.DeleteNVMeSubsystem = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/DeleteNVMeSubsystem',
                request_serializer=frontend__nvme__pcie__pb2.DeleteNVMeSubsystemRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateNVMeSubsystem = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/UpdateNVMeSubsystem',
                request_serializer=frontend__nvme__pcie__pb2.UpdateNVMeSubsystemRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeSubsystem.FromString,
                )
        self.ListNVMeSubsystem = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/ListNVMeSubsystem',
                request_serializer=frontend__nvme__pcie__pb2.ListNVMeSubsystemRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.ListNVMeSubsystemResponse.FromString,
                )
        self.GetNVMeSubsystem = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/GetNVMeSubsystem',
                request_serializer=frontend__nvme__pcie__pb2.GetNVMeSubsystemRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeSubsystem.FromString,
                )
        self.NVMeSubsystemStats = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/NVMeSubsystemStats',
                request_serializer=frontend__nvme__pcie__pb2.NVMeSubsystemStatsRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeSubsystemStatsResponse.FromString,
                )
        self.CreateNVMeController = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/CreateNVMeController',
                request_serializer=frontend__nvme__pcie__pb2.CreateNVMeControllerRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeController.FromString,
                )
        self.DeleteNVMeController = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/DeleteNVMeController',
                request_serializer=frontend__nvme__pcie__pb2.DeleteNVMeControllerRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateNVMeController = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/UpdateNVMeController',
                request_serializer=frontend__nvme__pcie__pb2.UpdateNVMeControllerRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeController.FromString,
                )
        self.ListNVMeController = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/ListNVMeController',
                request_serializer=frontend__nvme__pcie__pb2.ListNVMeControllerRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.ListNVMeControllerResponse.FromString,
                )
        self.GetNVMeController = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/GetNVMeController',
                request_serializer=frontend__nvme__pcie__pb2.GetNVMeControllerRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeController.FromString,
                )
        self.NVMeControllerStats = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/NVMeControllerStats',
                request_serializer=frontend__nvme__pcie__pb2.NVMeControllerStatsRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeControllerStatsResponse.FromString,
                )
        self.CreateNVMeNamespace = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/CreateNVMeNamespace',
                request_serializer=frontend__nvme__pcie__pb2.CreateNVMeNamespaceRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeNamespace.FromString,
                )
        self.DeleteNVMeNamespace = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/DeleteNVMeNamespace',
                request_serializer=frontend__nvme__pcie__pb2.DeleteNVMeNamespaceRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.UpdateNVMeNamespace = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/UpdateNVMeNamespace',
                request_serializer=frontend__nvme__pcie__pb2.UpdateNVMeNamespaceRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeNamespace.FromString,
                )
        self.ListNVMeNamespace = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/ListNVMeNamespace',
                request_serializer=frontend__nvme__pcie__pb2.ListNVMeNamespaceRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.ListNVMeNamespaceResponse.FromString,
                )
        self.GetNVMeNamespace = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/GetNVMeNamespace',
                request_serializer=frontend__nvme__pcie__pb2.GetNVMeNamespaceRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeNamespace.FromString,
                )
        self.NVMeNamespaceStats = channel.unary_unary(
                '/opi_api.storage.v1.FrontendNvmeService/NVMeNamespaceStats',
                request_serializer=frontend__nvme__pcie__pb2.NVMeNamespaceStatsRequest.SerializeToString,
                response_deserializer=frontend__nvme__pcie__pb2.NVMeNamespaceStatsResponse.FromString,
                )


class FrontendNvmeServiceServicer(object):
    """Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
    """

    def CreateNVMeSubsystem(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteNVMeSubsystem(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateNVMeSubsystem(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListNVMeSubsystem(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetNVMeSubsystem(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def NVMeSubsystemStats(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateNVMeController(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteNVMeController(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateNVMeController(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListNVMeController(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetNVMeController(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def NVMeControllerStats(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateNVMeNamespace(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteNVMeNamespace(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateNVMeNamespace(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListNVMeNamespace(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetNVMeNamespace(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def NVMeNamespaceStats(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_FrontendNvmeServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateNVMeSubsystem': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateNVMeSubsystem,
                    request_deserializer=frontend__nvme__pcie__pb2.CreateNVMeSubsystemRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeSubsystem.SerializeToString,
            ),
            'DeleteNVMeSubsystem': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteNVMeSubsystem,
                    request_deserializer=frontend__nvme__pcie__pb2.DeleteNVMeSubsystemRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateNVMeSubsystem': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateNVMeSubsystem,
                    request_deserializer=frontend__nvme__pcie__pb2.UpdateNVMeSubsystemRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeSubsystem.SerializeToString,
            ),
            'ListNVMeSubsystem': grpc.unary_unary_rpc_method_handler(
                    servicer.ListNVMeSubsystem,
                    request_deserializer=frontend__nvme__pcie__pb2.ListNVMeSubsystemRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.ListNVMeSubsystemResponse.SerializeToString,
            ),
            'GetNVMeSubsystem': grpc.unary_unary_rpc_method_handler(
                    servicer.GetNVMeSubsystem,
                    request_deserializer=frontend__nvme__pcie__pb2.GetNVMeSubsystemRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeSubsystem.SerializeToString,
            ),
            'NVMeSubsystemStats': grpc.unary_unary_rpc_method_handler(
                    servicer.NVMeSubsystemStats,
                    request_deserializer=frontend__nvme__pcie__pb2.NVMeSubsystemStatsRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeSubsystemStatsResponse.SerializeToString,
            ),
            'CreateNVMeController': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateNVMeController,
                    request_deserializer=frontend__nvme__pcie__pb2.CreateNVMeControllerRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeController.SerializeToString,
            ),
            'DeleteNVMeController': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteNVMeController,
                    request_deserializer=frontend__nvme__pcie__pb2.DeleteNVMeControllerRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateNVMeController': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateNVMeController,
                    request_deserializer=frontend__nvme__pcie__pb2.UpdateNVMeControllerRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeController.SerializeToString,
            ),
            'ListNVMeController': grpc.unary_unary_rpc_method_handler(
                    servicer.ListNVMeController,
                    request_deserializer=frontend__nvme__pcie__pb2.ListNVMeControllerRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.ListNVMeControllerResponse.SerializeToString,
            ),
            'GetNVMeController': grpc.unary_unary_rpc_method_handler(
                    servicer.GetNVMeController,
                    request_deserializer=frontend__nvme__pcie__pb2.GetNVMeControllerRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeController.SerializeToString,
            ),
            'NVMeControllerStats': grpc.unary_unary_rpc_method_handler(
                    servicer.NVMeControllerStats,
                    request_deserializer=frontend__nvme__pcie__pb2.NVMeControllerStatsRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeControllerStatsResponse.SerializeToString,
            ),
            'CreateNVMeNamespace': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateNVMeNamespace,
                    request_deserializer=frontend__nvme__pcie__pb2.CreateNVMeNamespaceRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeNamespace.SerializeToString,
            ),
            'DeleteNVMeNamespace': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteNVMeNamespace,
                    request_deserializer=frontend__nvme__pcie__pb2.DeleteNVMeNamespaceRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateNVMeNamespace': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateNVMeNamespace,
                    request_deserializer=frontend__nvme__pcie__pb2.UpdateNVMeNamespaceRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeNamespace.SerializeToString,
            ),
            'ListNVMeNamespace': grpc.unary_unary_rpc_method_handler(
                    servicer.ListNVMeNamespace,
                    request_deserializer=frontend__nvme__pcie__pb2.ListNVMeNamespaceRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.ListNVMeNamespaceResponse.SerializeToString,
            ),
            'GetNVMeNamespace': grpc.unary_unary_rpc_method_handler(
                    servicer.GetNVMeNamespace,
                    request_deserializer=frontend__nvme__pcie__pb2.GetNVMeNamespaceRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeNamespace.SerializeToString,
            ),
            'NVMeNamespaceStats': grpc.unary_unary_rpc_method_handler(
                    servicer.NVMeNamespaceStats,
                    request_deserializer=frontend__nvme__pcie__pb2.NVMeNamespaceStatsRequest.FromString,
                    response_serializer=frontend__nvme__pcie__pb2.NVMeNamespaceStatsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.FrontendNvmeService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class FrontendNvmeService(object):
    """Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
    """

    @staticmethod
    def CreateNVMeSubsystem(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/CreateNVMeSubsystem',
            frontend__nvme__pcie__pb2.CreateNVMeSubsystemRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeSubsystem.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteNVMeSubsystem(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/DeleteNVMeSubsystem',
            frontend__nvme__pcie__pb2.DeleteNVMeSubsystemRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateNVMeSubsystem(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/UpdateNVMeSubsystem',
            frontend__nvme__pcie__pb2.UpdateNVMeSubsystemRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeSubsystem.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListNVMeSubsystem(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/ListNVMeSubsystem',
            frontend__nvme__pcie__pb2.ListNVMeSubsystemRequest.SerializeToString,
            frontend__nvme__pcie__pb2.ListNVMeSubsystemResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetNVMeSubsystem(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/GetNVMeSubsystem',
            frontend__nvme__pcie__pb2.GetNVMeSubsystemRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeSubsystem.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def NVMeSubsystemStats(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/NVMeSubsystemStats',
            frontend__nvme__pcie__pb2.NVMeSubsystemStatsRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeSubsystemStatsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateNVMeController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/CreateNVMeController',
            frontend__nvme__pcie__pb2.CreateNVMeControllerRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeController.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteNVMeController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/DeleteNVMeController',
            frontend__nvme__pcie__pb2.DeleteNVMeControllerRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateNVMeController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/UpdateNVMeController',
            frontend__nvme__pcie__pb2.UpdateNVMeControllerRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeController.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListNVMeController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/ListNVMeController',
            frontend__nvme__pcie__pb2.ListNVMeControllerRequest.SerializeToString,
            frontend__nvme__pcie__pb2.ListNVMeControllerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetNVMeController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/GetNVMeController',
            frontend__nvme__pcie__pb2.GetNVMeControllerRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeController.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def NVMeControllerStats(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/NVMeControllerStats',
            frontend__nvme__pcie__pb2.NVMeControllerStatsRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeControllerStatsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateNVMeNamespace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/CreateNVMeNamespace',
            frontend__nvme__pcie__pb2.CreateNVMeNamespaceRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeNamespace.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteNVMeNamespace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/DeleteNVMeNamespace',
            frontend__nvme__pcie__pb2.DeleteNVMeNamespaceRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateNVMeNamespace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/UpdateNVMeNamespace',
            frontend__nvme__pcie__pb2.UpdateNVMeNamespaceRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeNamespace.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListNVMeNamespace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/ListNVMeNamespace',
            frontend__nvme__pcie__pb2.ListNVMeNamespaceRequest.SerializeToString,
            frontend__nvme__pcie__pb2.ListNVMeNamespaceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetNVMeNamespace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/GetNVMeNamespace',
            frontend__nvme__pcie__pb2.GetNVMeNamespaceRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeNamespace.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def NVMeNamespaceStats(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.FrontendNvmeService/NVMeNamespaceStats',
            frontend__nvme__pcie__pb2.NVMeNamespaceStatsRequest.SerializeToString,
            frontend__nvme__pcie__pb2.NVMeNamespaceStatsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
