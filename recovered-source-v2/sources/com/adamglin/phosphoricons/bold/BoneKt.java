package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBone", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoneKt {
    private static ImageVector _bone;

    public static final ImageVector getBone(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _bone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.74f, 58.31f);
        pathBuilder.arcToRelative(39.89f, 39.89f, 0.0f, false, false, -23.35f, -13.7f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -74.86f, 25.87f);
        pathBuilder.lineToRelative(-66.0f, 66.05f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -25.87f, 74.86f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 74.86f, -25.86f);
        pathBuilder.lineToRelative(66.05f, -66.06f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 49.22f, -61.16f);
        pathBuilder.close();
        pathBuilder.moveTo(216.1f, 94.51f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.54f, 3.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -24.84f, 2.76f);
        pathBuilder.lineToRelative(-70.4f, 70.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -2.75f, 24.84f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -29.41f, 6.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 56.3f, 187.7f);
        pathBuilder.arcToRelative(11.61f, 11.61f, 0.0f, false, false, -1.85f, 0.14f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 6.0f, -29.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.83f, -2.76f);
        pathBuilder.lineToRelative(70.4f, -70.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 2.76f, -24.84f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 29.4f, -6.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.71f, 13.71f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 216.1f, 94.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
