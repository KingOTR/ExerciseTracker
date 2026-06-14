package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cellsignalslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CellSignalSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCellSignalSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cellSignalSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CellsignalslashKt {
    private static ImageVector _cellSignalSlash;

    public static final ImageVector getCellSignalSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cellSignalSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CellSignalSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.38f, 221.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f);
        pathBuilder.lineToRelative(-5.51f, -6.06f);
        pathBuilder.arcTo(16.11f, 16.11f, 0.0f, false, true, 192.0f, 216.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.06f, -10.59f);
        pathBuilder.arcToRelative(16.4f, 16.4f, 0.0f, false, true, 4.07f, -17.0f);
        pathBuilder.lineToRelative(79.13f, -79.12f);
        pathBuilder.lineTo(42.26f, 45.62f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, 0.14f, -11.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.48f, 0.37f);
        pathBuilder.lineToRelative(160.0f, 176.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f);
        pathBuilder.close();
        pathBuilder.moveTo(201.0f, 172.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.69f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.32f, -11.32f);
        pathBuilder.lineToRelative(-55.21f, 55.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.13f, 5.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cellSignalSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
