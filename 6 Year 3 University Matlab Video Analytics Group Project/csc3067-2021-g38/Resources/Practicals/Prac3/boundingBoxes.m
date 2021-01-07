function [BBs] = boundingBoxes(BlobsLabelled)
%Task 4: Get bounding boxes for labelled blobs
BBs = [];
NumVehicles = max(max(BlobsLabelled));
for b = 1: NumVehicles
 [ys, xs]=find(BlobsLabelled == b);
 xmax=max(xs);
 ymax=max(ys);
 xmin=min(xs);
 ymin=min(ys);
 BB = [xmin ymin xmax ymax];
 BBs = [BBs; BB];
end
end

